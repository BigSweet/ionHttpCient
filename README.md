# ionHttpCient
对ion网络框架进行的封装
用法
  NetInterfaceFactory.getNetInterface().doRequest(JavaRequestParem.
                        get("https://aggr.anlaiye.com.cn/aggre/user/1311139/follow/feed/list?appid=1&appplt=aph&appver=3.1.0"),
                new RequestListner<FeedBeanList>(FeedBeanList.class) {

                    @Override
                    public boolean onSuccess(FeedBeanList feedBeanList) throws Exception {
                        mFeedBeen = feedBeanList.getList();
                        sv.setImageURI(mFeedBeen.get(0).getUser().getAvatar());
                        Toast.makeText(getApplicationContext(), "获取网络图片成功", Toast.LENGTH_SHORT).show();
                        return super.onSuccess(feedBeanList);

                    }

                    @Override
                    public void onEnd(ResultMessage e) {
                        super.onEnd(e);
                        if (!e.isSuccess()) {
                            Toast.makeText(getApplicationContext(), e.getMessage(), Toast.LENGTH_SHORT).show();
                        }
                    }
                });
有过滤器会直接过滤掉flag=1的接口data数据，直接从data后的数据开始解析   
直接在重写onsuccess的T或者list<T>根据接口返回的数据进行重写，填入接收的bean，就可拿到数据
