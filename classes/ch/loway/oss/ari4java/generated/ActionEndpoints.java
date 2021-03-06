package ch.loway.oss.ari4java.generated;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
//    Generated on: Fri Mar 20 17:43:44 CET 2015
// ----------------------------------------------------

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import ch.loway.oss.ari4java.tools.RestException;
import ch.loway.oss.ari4java.tools.AriCallback;
import ch.loway.oss.ari4java.tools.tags.*;

/**********************************************************
 * 
 * Generated by: JavaInterface
 *********************************************************/


public interface ActionEndpoints {

// Endpoint get String String
/**********************************************************
 * Details for an endpoint.
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public Endpoint get(String tech, String resource) throws RestException;



// List<Endpoint> listByTech String
/**********************************************************
 * List available endoints for a given endpoint technology.
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public List<Endpoint> listByTech(String tech) throws RestException;



// void list AriCallback<List<Endpoint>> callback
/**********************************************************
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void list(AriCallback<List<Endpoint>> callback);



// void sendMessageToEndpoint String String String String Map<String,String> AriCallback<Void> callback
/**********************************************************
 * 
 * 
 * @since ari_1_5_0
 *********************************************************/
public void sendMessageToEndpoint(String tech, String resource, String from, String body, Map<String,String> variables, AriCallback<Void> callback);



// void sendMessage String String String Map<String,String> AriCallback<Void> callback
/**********************************************************
 * 
 * 
 * @since ari_1_5_0
 *********************************************************/
public void sendMessage(String to, String from, String body, Map<String,String> variables, AriCallback<Void> callback);



// void listByTech String AriCallback<List<Endpoint>> callback
/**********************************************************
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void listByTech(String tech, AriCallback<List<Endpoint>> callback);



// void get String String AriCallback<Endpoint> callback
/**********************************************************
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void get(String tech, String resource, AriCallback<Endpoint> callback);



// List<Endpoint> list
/**********************************************************
 * List all endpoints.
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public List<Endpoint> list() throws RestException;



// void sendMessageToEndpoint String String String String Map<String,String>
/**********************************************************
 * Send a message to some endpoint in a technology.
 * 
 * 
 * @since ari_1_5_0
 *********************************************************/
public void sendMessageToEndpoint(String tech, String resource, String from, String body, Map<String,String> variables) throws RestException;



// void sendMessage String String String Map<String,String>
/**********************************************************
 * Send a message to some technology URI or endpoint.
 * 
 * 
 * @since ari_1_5_0
 *********************************************************/
public void sendMessage(String to, String from, String body, Map<String,String> variables) throws RestException;


}
;
