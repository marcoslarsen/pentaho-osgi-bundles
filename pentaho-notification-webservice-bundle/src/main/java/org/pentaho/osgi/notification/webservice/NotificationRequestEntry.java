/*! ******************************************************************************
 *
 * Pentaho Data Integration
 *
 * Copyright (C) 2002-2017 by Hitachi Vantara : http://www.pentaho.com
 *
 *******************************************************************************
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 ******************************************************************************/

package org.pentaho.osgi.notification.webservice;

/**
 * Created by bryan on 8/21/14.
 */
public class NotificationRequestEntry {
  private String id;
  private Long sequence;

  public NotificationRequestEntry() {
    this( null, null );
  }

  public NotificationRequestEntry( String id, Long sequence ) {
    this.id = id;
    this.sequence = sequence;
  }

  public String getId() {
    return id;
  }

  public void setId( String id ) {
    this.id = id;
  }

  public Long getSequence() {
    return sequence;
  }

  public void setSequence( Long sequence ) {
    this.sequence = sequence;
  }
}
