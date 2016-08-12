/** 
 * Copyright 2010 Daniel Guermeur and Amy Unruh
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 *   See http://connectrapp.appspot.com/ for a demo, and links to more information 
 *   about this app and the book that it accompanies.
 */
package com.metadot.book.connectr.client.event;

import java.util.List;

import com.google.gwt.event.shared.GwtEvent;
import com.metadot.book.connectr.shared.FriendSummaryDTO;

public class FriendSummariesReceivedEvent extends GwtEvent<FriendSummariesReceivedEventHandler> {
  public static Type<FriendSummariesReceivedEventHandler> TYPE = new Type<FriendSummariesReceivedEventHandler>();
  private final List<FriendSummaryDTO> friendSummaries;

  public FriendSummariesReceivedEvent(List<FriendSummaryDTO> friendSummaries) {
    this.friendSummaries = friendSummaries;
  }

  public List<FriendSummaryDTO> getFriendSummaries() {
    return friendSummaries;
  }

  @Override
  public Type<FriendSummariesReceivedEventHandler> getAssociatedType() {
    return TYPE;
  }

  @Override
  protected void dispatch(FriendSummariesReceivedEventHandler handler) {
    handler.onFriendSummaryReceived(this);
  }
}
