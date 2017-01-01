/*******************************************************************************
 *        File: LobbyApplication.java
 *    Revision: 1
 * Description: TODO
 *      Author: Morteza Ansarinia <ansarinia@me.com>
 *  Created on: Jan 1, 2017
 *     Project: social.cut.lobby
 *   Copyright: See the file "LICENSE" for the full license governing this code.
 *******************************************************************************/
package social.cut.lobby;

import com.github.aesteve.vertx.nubes.VertxNubes;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.Vertx;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;
import io.vertx.ext.web.Router;
import social.cut.lobby.services.MongoService;

public class LobbyApplication extends VertxNubes {
  
  public static final String MONGO_SERVICE_NAME = "mongo";
  
  private static final Logger LOG = LoggerFactory.getLogger(LobbyApplication.class);

  protected MongoService mongo;
  
  public LobbyApplication(Vertx vertx, JsonObject config) {
    super(vertx, config);
    mongo = new MongoService();
    registerService(MONGO_SERVICE_NAME, mongo);
    LOG.info("Mongo service registered!");
  }

  @Override
  public void bootstrap(Handler<AsyncResult<Router>> handler) {
    super.bootstrap(handler);
  }
}
