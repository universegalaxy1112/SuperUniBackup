package com.uni.julio.superplus.utils.networing;

import java.security.cert.X509Certificate;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

public class HttpRequest {
    private static HttpRequest m_HttpRInstante;

    public static HttpRequest getInstance() {
        if(m_HttpRInstante == null) {
            m_HttpRInstante = new HttpRequest();
        }
        return m_HttpRInstante;
    }

    private HttpRequest() {

    }

    public void check() {
        TrustManager[] trustAllCerts = new TrustManager[]{new X509TrustManager() {
            public X509Certificate[] getAcceptedIssuers() {
                return new X509Certificate[]{};
            }

            public void checkClientTrusted(X509Certificate[] certs, String authType) {
            }

            public void checkServerTrusted(X509Certificate[] certs, String authType) {
            }
        }};

        try {
            SSLContext sc = SSLContext.getInstance("SSL");
            sc.init(null, trustAllCerts, new java.security.SecureRandom());
            HttpsURLConnection
                    .setDefaultSSLSocketFactory(sc.getSocketFactory());
            HttpsURLConnection.setDefaultHostnameVerifier(new HostnameVerifier() {
                @Override
                public boolean verify(String hostname, SSLSession session) {
                    return (hostname != null && (hostname.toLowerCase().contains("supertvplus.com") || hostname.toLowerCase().contains("superteve.com") || hostname.length() > 0) );
                }
            });

        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}
