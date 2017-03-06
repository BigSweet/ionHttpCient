# ionHttpCient
对ion网络框架进行的封装
用法
 DataSource.getUrl(new RequestListner<AdListBean>(AdListBean.class) {
            @Override
            public boolean onSuccess(AdListBean bean) throws Exception {
                sv.setImageURI("https://pic.anlaiye.com.cn/7636cd7803734dd8a7b7989200aecbd4_750x750.png");
                Toast.makeText(getApplicationContext(), "获取网络图片成功", Toast.LENGTH_SHORT).show();
                return super.onSuccess(bean);
            }

            @Override
            public void onEnd(ResultMessage e) {
                super.onEnd(e);
                if (!e.isSuccess()) {
                    Toast.makeText(getApplicationContext(), e.getMessage(), Toast.LENGTH_SHORT).show();
                }
            }
        });
        
        
        public class DataSource {
    //测试
    public static void getUrl(RequestListner<AdListBean> requestListner) {
        NetInterfaceFactory.getNetInterface().doRequest(DataUtil.getUrl(), requestListner);
    }
}

    //获取社团类型列表
    public static RequestParem getUrl() {
        return JavaRequestParem.post("http://adsvc.imcoming.com.cn/ad/app/getList.do")
                .putBody("locationId", "1")
                .putBody("client_type", "2")
                .putBody("device_id", "868026024156875")
                .putBody("schoolId", "1237")
                .putBody("app_version","3.1.5")
                .putBody("time", System.currentTimeMillis());

    }
    
    直接在重写onsuccess的T或者list<T>根据接口返回的数据进行重写，填入接收的bean，就可拿到数据
