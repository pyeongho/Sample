package ph.com.retorfit2.mvp.main;


import ph.com.retorfit2.model.TranslateMessage;

public interface MainView extends BaseView{

    void getDataSuccess(TranslateMessage model);

    void getDataFail(Integer code, String msg);

}
