/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UserRequest;

import User.SingleUser;

/**
 *
 * @author athipathi
 */
public class UserRequest {
    SingleUser fromUser;
    SingleUser toUser;
    Status status;
     public enum Status {
        RequestSent("Request Sent"), Waiting("Waiting for approval"), Confirmed("Confirmed"), Cancel("Cancel");

        private String value;

        private Status(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public UserRequest(SingleUser fromUser, SingleUser toUser,Status status) {
        this.fromUser = fromUser;
        this.toUser = toUser;
        this.status=status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public SingleUser getFromUser() {
        return fromUser;
    }

    public SingleUser getToUser() {
        return toUser;
    }

    public Status getStatus() {
        return status;
    }
}
