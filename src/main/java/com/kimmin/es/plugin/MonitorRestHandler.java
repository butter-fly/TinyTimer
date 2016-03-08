//package com.kimmin.es.plugin;
//
//import org.elasticsearch.common.inject.Inject;
//import org.elasticsearch.rest.*;
//
///**
// * Created by min.jin on 2016/3/8.
// */
//public class MonitorRestHandler implements RestHandler{
//
//    @Inject
//    public MonitorRestHandler(RestController controller){
//        controller.registerHandler(RestRequest.Method.GET,"/kill_monitor",this);
//    }
//
//    public void handleRequest(final RestRequest restRequest, final RestChannel channel){
//        MonitorServerStatus.getInstance().monitorThread.bRun = false;
//        channel.sendResponse(new BytesRestResponse(RestStatus.OK, "Kill Monitor Success!"));
//    }
//
//}