package cn.euraxluo.passbook.passbook.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * passbook
 * cn.euraxluo.passbook.passbook.vo
 * Response
 * 2019/12/29 17:57
 * author:Euraxluo
 * 返回响应对象
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Response {
    /** 错误码: 正确返回 0 */
    private Integer errorCode = 0;

    /** 错误信息，正确返回空字符串 */
    private String errorMsg = "";

    /** 返回值对象 */
    private Object data;

    /**
     * 正确响应构造函数
     * @param data
     */
    public Response(Object data){
        this.data = data;
    }

    /**
     * 空响应
     * @return
     */
    public static Response success(){
        return new Response();
    }

    /**
     * 错误响应
     * @param errorMsg
     * @return
     */
    public static Response failure(String  errorMsg){
        return new Response(-1,errorMsg,null);
    }
}
