/*******************************************************************************
 *        File: MongoService.java
 *    Revision: 1
 * Description: TODO
 *      Author: Morteza Ansarinia <ansarinia@me.com>
 *  Created on: Jan 1, 2017
 *     Project: social.cut.lobby
 *   Copyright: See the file "LICENSE" for the full license governing this code.
 *******************************************************************************/
package social.cut.lobby.services;

import com.github.aesteve.vertx.nubes.services.Service;

import io.vertx.core.Future;
import io.vertx.core.Vertx;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;
import io.vertx.ext.mongo.MongoClient;

public class MongoService implements Service {
  
  public MongoClient client = null;
	private Vertx vertx;
	private JsonObject config;
	
  private static final Logger LOG = LoggerFactory.getLogger(MongoService.class);

	public MongoService() {
	}

	@Override
	public void init(Vertx vertx, JsonObject config) {
		this.vertx = vertx;
		this.config = config;
	}
	
	@Override
	public void start(Future<Void> future) {
		if (client==null)
			client = MongoClient.createShared(vertx, config.getJsonObject("mongo"));
		future.complete();
	}
	

	@Override
	public void stop(Future<Void> future) {
		client.close();
		client = null;
		future.complete();
	}
}
