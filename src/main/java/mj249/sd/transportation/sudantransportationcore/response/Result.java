
package mj249.sd.transportation.sudantransportationcore.response;

import lombok.*;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Result<T> {
    @Getter
    @Setter
    private Integer responseCode;

    @Getter
    @Setter
    private String responseMessage;

    @Getter
    @Setter
    private T data;

    public static <T> Result<T> success(T data){
        return new Result<>(
                Response.SUCCESS.getResponseCode(),
                Response.SUCCESS.getResponseMessage(),
                data
        );
    }

    public static Result<?> itemNotFound(){
        return new Result<>(
                Response.ITEM_NOT_FOUND.getResponseCode(),
                Response.ITEM_NOT_FOUND.getResponseMessage(),
                null
        );
    }

    public static Result<?> tryAgain(){
        return new Result<>(
                Response.TRY_AGAIN.getResponseCode(),
                Response.TRY_AGAIN.getResponseMessage(),
                null
        );
    }

    public static Result<?> serverError(){
        return new Result<>(
                Response.SERVER_ERROR.getResponseCode(),
                Response.SERVER_ERROR.getResponseMessage(),
                null
        );
    }
}
