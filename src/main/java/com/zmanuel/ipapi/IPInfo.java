package com.zmanuel.ipapi;


import lombok.Data;
import org.apache.commons.io.IOUtils;
import org.json.JSONObject;

import java.net.URL;
import java.nio.charset.Charset;

@Data
public class IPInfo {

    private JSONObject json;
    private String ipAddr;
    private String city;
    private String region;
    private String regionCode;
    private String country;
    private String countryName;
    private String continentCode;
    private boolean inEurope;
    private String postal;
    private float latitude;
    private float longitude;
    private String timezone;
    private String utcOffset;
    private String countryCallingCode;
    private String currency;
    private String languages;
    private String asn;
    private String isp;

    public IPInfo(String ipAddr) {
        this.ipAddr = ipAddr;
        try {
            json = new JSONObject(IOUtils.toString(new URL("https://ipapi.co/" + ipAddr + "/json/"), Charset.forName("UTF-8")));
            this.city = json.getString("city");
            this.region = json.getString("region");
            this.regionCode = json.getString("region_code");
            this.country = json.getString("country");
            this.countryName = json.getString("country_name");
            this.continentCode = json.getString("continent_code");
            this.inEurope = json.getBoolean("in_eu");
            this.postal = json.getString("postal");
            this.latitude = json.getFloat("latitude");
            this.longitude = json.getFloat("longitude");
            this.timezone = json.getString("timezone");
            this.utcOffset = json.getString("utc_offset");
            this.countryCallingCode = json.getString("country_calling_code");
            this.currency = json.getString("currency");
            this.languages = json.getString("languages");
            this.asn = json.getString("asn");
            this.isp = json.getString("org");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
