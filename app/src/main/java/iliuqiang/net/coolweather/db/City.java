package iliuqiang.net.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by LQ on 2017/1/22.
 */

public class City extends DataSupport {
    private int id;
    private String cityName;
    private int cityCode;

    public int getId() {
        return id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

    public void setId(int id) {
        this.id = id;

    }

    private int provinceId;

}
