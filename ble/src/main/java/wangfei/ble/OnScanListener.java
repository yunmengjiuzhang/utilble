package wangfei.ble;

import java.util.ArrayList;

/**
 * Created by fei on 2017/1/11.
 * 搜索到的ble列表改变监听
 */
public interface OnScanListener {
    void onNewBleBean(BleBean bean);

    void onBleBeanList(ArrayList<BleBean> mScans);
}
