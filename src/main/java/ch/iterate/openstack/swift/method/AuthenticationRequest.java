package ch.iterate.openstack.swift.method;

import org.apache.http.client.methods.HttpUriRequest;

import ch.iterate.openstack.swift.Client;

public interface AuthenticationRequest extends HttpUriRequest {

    Client.AuthVersion getVersion();
}
