/*
 * Copyright (c) 2022.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jivesoftware.openfire.plugin.rest.entity;

import org.xmpp.packet.JID;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlRootElement(name = "result")
@XmlType(propOrder = { "roomName", "resultType", "message"})
public class RoomCreationResultEntity {

    public enum RoomCreationResultType {
        Success, Failure
    }

    String roomName;
    RoomCreationResultType resultType;
    String message;

    @XmlElement
    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = JID.nodeprep(roomName);
    }

    @XmlElement
    public RoomCreationResultType getResultType() {
        return resultType;
    }

    public void setResultType(RoomCreationResultType resultType) {
        this.resultType = resultType;
    }

    @XmlElement
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
