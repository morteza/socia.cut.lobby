/*******************************************************************************
 *        File: LobbyServer.java
 *    Revision: 1
 * Description: TODO
 *      Author: Morteza Ansarinia <ansarinia@me.com>
 *  Created on: Jan 1, 2017
 *     Project: social.cut.lobby
 *   Copyright: See the file "LICENSE" for the full license governing this code.
 *******************************************************************************/
package social.cut.lobby;

import com.github.aesteve.vertx.nubes.NubesServer;

import io.vertx.core.Context;
import io.vertx.core.Vertx;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;
import io.vertx.ext.web.Router;

public class LobbyServer extends NubesServer {

  protected Router router;
  
  private static final Logger LOG = LoggerFactory.getLogger(LobbyServer.class);
  
  @Override
  public void init(Vertx vertx, Context context) {
    super.init(vertx, context);
    nubes = new LobbyApplication(vertx, context.config());
  }

}
