
package mj249.sd.transportation.sudantransportationcore.response;

public enum Response {
    SUCCESS(200, "Successful"),
    ITEM_NOT_FOUND(404, "Item Not Found"),
    TRY_AGAIN(440, "Try Again"),
    SERVER_ERROR(500, "There Is A Problem In The Server");

    private Integer responseCode;
    private String responseMessage;

    Response(Integer responseCode, String responseMessage){
        this.responseCode = responseCode;
        this.responseMessage = responseMessage;
    }

    public Integer getResponseCode(){
        return  responseCode;
    }
    public String getResponseMessage(){
        return  responseMessage;
    }
}
