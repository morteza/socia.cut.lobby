/*******************************************************************************
 *        File: Lobby.java
 *    Revision: 1
 * Description: TODO
 *      Author: Morteza Ansarinia <ansarinia@me.com>
 *  Created on: Jan 01, 2017
 *     Project: social.cut.lobby
 *   Copyright: See the file "LICENSE" for the full license governing this code.
 *******************************************************************************/

package social.cut.lobby.models;

import java.util.List;

public class Lobby {
  
  public String id;
  public String gameId;
  public List<Player> activePlayers;
  
  public Lobby(Game game) {
    
  }
}
