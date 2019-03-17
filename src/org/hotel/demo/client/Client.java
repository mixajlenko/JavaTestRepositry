package org.hotel.demo.client;

import java.util.Objects;

public class Client {

    private String phoneNumber;

    private String clientName;

    public Client(String phoneNumber, String clientName) {
        this.phoneNumber = phoneNumber;
        this.clientName = clientName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getClientName() {
        return clientName;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Client{");
        sb.append("phoneNumber='").append(phoneNumber).append('\'');
        sb.append(", clientName='").append(clientName).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object anotherObject) {
        if (this == anotherObject) return true;
        if (anotherObject == null || getClass() != anotherObject.getClass()) return false;
        Client client = (Client) anotherObject;
        return Objects.equals(phoneNumber, client.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phoneNumber);
    }
}
