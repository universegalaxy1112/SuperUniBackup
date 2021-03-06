package com.uni.julio.superplus.utils.networing;

public class WebConfig {
    private static final String domain = "https://supertvplus.com";
    public static final String baseURL              = "https://supertvplus.com/Wm7TSJNObuI/";
    public static final String GetCodeURL = "https://supertvplus.com/dtYjAcIdG7NYB/Connect/loginCode.php?request_code";
    public static final String getCategoriesForYear = "https://supertvplus.com/dtYjAcIdG7NYB/Connect/movie_category_year.php";
    public static final String LoginSplash = "https://supertvplus.com/dtYjAcIdG7NYB/Connect/login.php?user={USER}&pass={PASS}&istv={ISTV}&device_id={DEVICE_ID}&splash";
    public static final String getMessage = "https://supertvplus.com/dtYjAcIdG7NYB/Connect/getMessage.php?user={USER}";
    public static final String removeUserURL = "https://supertvplus.com/dtYjAcIdG7NYB/Connect/login.php?user={USER}&device_num=0&device_id={DEVICE_ID}&delete";
    public static final String trackingURL = "https://supertvplus.com/dtYjAcIdG7NYB/Connect/tracking.php?username={USER}&movie={MOVIE}&ip={IP}&device_id={DEVICE_ID}&isTV={ISTV}";
    public static final String likeURL = "https://supertvplus.com/dtYjAcIdG7NYB/Connect/like.php?movieId={MOVIEID}&like={LIKE}&dislike={DISLIKE}&userId={USERID}";
    public static final String getLikeURL = "https://supertvplus.com/dtYjAcIdG7NYB/Connect/getLike.php?movieId={MOVIEID}&userId={USERID}";
    public static final String loginURL             = domain + "/dtYjAcIdG7NYB/Connect/login.php?user={USER}&pass={PASS}&device_id={DEVICE_ID}&model={MODEL}&fw={FW}&country={COUNTRY}&istv={ISTV}";
    public static final String liveTVCategoriesURL          = domain + "/dtYjAcIdG7NYB/Connect/live_categorias.php";
    public static final String liveTVChannelsURL            = domain + "/dtYjAcIdG7NYB/Connect/live_canales.php?cve={CAT_ID}";
    public static final String updateURL = "https://supertvplus.com/dtYjAcIdG7NYB/Connect/upgrade_version.php?new_version";
    public static final String videoSearchURL = "https://supertvplus.com/dtYjAcIdG7NYB/Connect/searchVideo.php?type={TYPE}&pattern={PATTERN}";
    public static final String getMoviesYear = "https://supertvplus.com/dtYjAcIdG7NYB/Connect/movie_year.php?year={YEAR}";
    public static final String reportUrl = baseURL + "reportar.php?cve={CVE}&tipo={TIPO}&user={USER}&act={ACT}";
    public static final String orderUrl = baseURL + "order_title.php?tipo={TIPO}&user={USER}&titulo={TITLE}";
    public static final String addRecent = baseURL + "view_recent.php?tipo={TIPO}&user={USER}&cve={CVE}";
    public static final String addFavorite = baseURL + "add_favorites.php?tipo={TIPO}&user={USER}&cve={CVE}&action={ACTION}";

}
