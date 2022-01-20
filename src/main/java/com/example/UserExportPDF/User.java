package com.example.UserExportPDF;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = true)
public class User {
    private String login;
    private Integer id;
    private String nodeId;
    private String avatarURL;
    private String gravatarId;
    private String url;
    private String htmlURL;
    private String followersURL;
    private String followingURL;
    private String gistsURL;
    private String starredURL;
    private String subscriptionsURL;
    private String organizationsURL;
    private String reposURL;
    private String eventsURL;
    private String receivedEventsURL;
    private String type;
    private Boolean siteAdmin;

    @JsonGetter("login")
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @JsonGetter("id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @JsonGetter("node_id")
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    @JsonGetter("avatar_url")
    public String getAvatarURL() {
        return avatarURL;
    }

    public void setAvatarURL(String avatarURL) {
        this.avatarURL = avatarURL;
    }

    @JsonGetter("gravatar_id")
    public String getGravatarId() {
        return gravatarId;
    }

    public void setGravatarId(String gravatarId) {
        this.gravatarId = gravatarId;
    }

    @JsonGetter("url")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @JsonGetter("html_url")
    public String getHtmlURL() {
        return htmlURL;
    }

    public void setHtmlURL(String htmlURL) {
        this.htmlURL = htmlURL;
    }

    @JsonGetter("followers_url")
    public String getFollowersURL() {
        return followersURL;
    }

    public void setFollowersURL(String followersURL) {
        this.followersURL = followersURL;
    }

    @JsonGetter("following_url")
    public String getFollowingURL() {
        return followingURL;
    }

    public void setFollowingURL(String followingURL) {
        this.followingURL = followingURL;
    }

    @JsonGetter("gists_url")
    public String getGistsURL() {
        return gistsURL;
    }

    public void setGistsURL(String gistsURL) {
        this.gistsURL = gistsURL;
    }

    @JsonGetter("starred_url")
    public String getStarredURL() {
        return starredURL;
    }

    public void setStarredURL(String starredURL) {
        this.starredURL = starredURL;
    }

    @JsonGetter("subscriptions_url")
    public String getSubscriptionsURL() {
        return subscriptionsURL;
    }

    public void setSubscriptionsURL(String subscriptionsURL) {
        this.subscriptionsURL = subscriptionsURL;
    }

    @JsonGetter("organizations_url")
    public String getOrganizationsURL() {
        return organizationsURL;
    }

    public void setOrganizationsURL(String organizationsURL) {
        this.organizationsURL = organizationsURL;
    }

    @JsonGetter("repos_url")
    public String getReposURL() {
        return reposURL;
    }

    public void setReposURL(String reposURL) {
        this.reposURL = reposURL;
    }

    @JsonGetter("events_url")
    public String getEventsURL() {
        return eventsURL;
    }

    public void setEventsURL(String eventsURL) {
        this.eventsURL = eventsURL;
    }

    @JsonGetter("received_events_url")
    public String getReceivedEventsURL() {
        return receivedEventsURL;
    }

    public void setReceivedEventsURL(String receivedEventsURL) {
        this.receivedEventsURL = receivedEventsURL;
    }

    @JsonGetter("type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @JsonGetter("site_admin")
    public Boolean getSiteAdmin() {
        return siteAdmin;
    }

    public void setSiteAdmin(Boolean siteAdmin) {
        this.siteAdmin = siteAdmin;
    }
}