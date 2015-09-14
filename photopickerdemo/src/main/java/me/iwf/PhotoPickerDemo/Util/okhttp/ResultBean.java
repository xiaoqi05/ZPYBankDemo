package me.iwf.PhotoPickerDemo.Util.okhttp;

import java.io.Serializable;

/*********************************************************************************
 * Project Name  : PhotoPicker
 * Package       : me.iwf.PhotoPickerDemo.Util.okhttp
 *
 * @AUTHOR by 肖齐
 * 邮箱：xiaoqi262@163.com
 * Created by 2015/8/30 15:44.
 * <p/>
 * <p/>
 * ********************************************************************************
 */
public class ResultBean implements Serializable{

    /**
     * code : 1001
     * result : 1
     */

    private int code;
    private int result;

    public void setCode(int code) {
        this.code = code;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public int getCode() {
        return code;
    }

    public int getResult() {
        return result;
    }
}