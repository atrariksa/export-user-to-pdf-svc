package com.example.UserExportPDF;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

import java.io.ByteArrayOutputStream;
import java.util.List;

public class PDFExporter {
    public static ByteArrayOutputStream buildPDF(List<User> users) throws Exception {
        PDDocument document = new PDDocument();
        PDPage page = new PDPage();
        document.addPage(page);

        PDPageContentStream contentStream = new PDPageContentStream(document, page);

        contentStream.setFont(PDType1Font.TIMES_ROMAN, 62);
        contentStream.beginText();
        contentStream.setLeading(14.5f);
        contentStream.newLineAtOffset(180, 725);
        contentStream.newLine();
        contentStream.newLine();
        contentStream.newLine();
        contentStream.newLine();
        contentStream.newLine();
        contentStream.newLine();
        contentStream.newLine();
        contentStream.newLine();
        contentStream.showText("Github Users");
        contentStream.newLine();
        contentStream.newLine();
        contentStream.endText();
        contentStream.close();

        for (int i = 0; i < users.size(); i++) {
            PDPage pageNext = new PDPage();
            document.addPage(pageNext);
            PDPageContentStream contentStreamNext = new PDPageContentStream(document, pageNext);

            contentStreamNext.setFont(PDType1Font.TIMES_ROMAN, 14);
            contentStreamNext.beginText();
            contentStreamNext.setLeading(14.5f);
            contentStreamNext.newLineAtOffset(25, 725);
            userDataToString(contentStreamNext,users.get(i));
            contentStreamNext.newLine();
            contentStreamNext.endText();
            contentStreamNext.close();
        }

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        document.save(byteArrayOutputStream);
        document.close();
        return byteArrayOutputStream;
    }

    public static void userDataToString(PDPageContentStream contentStream, User user) throws Exception {
        contentStream.showText("login : "+user.getLogin());
        contentStream.newLine();

        contentStream.showText("id : "+user.getId().toString());
        contentStream.newLine();

        contentStream.showText("nodeId : "+user.getNodeId());
        contentStream.newLine();

        contentStream.showText("avatarURL : "+user.getAvatarURL());
        contentStream.newLine();

        contentStream.showText("gravatarId : "+user.getGravatarId());
        contentStream.newLine();

        contentStream.showText("url : "+user.getUrl());
        contentStream.newLine();

        contentStream.showText("htmlURL : "+user.getHtmlURL());
        contentStream.newLine();

        contentStream.showText("followersURL : "+user.getFollowersURL());
        contentStream.newLine();

        contentStream.showText("followingURL : "+user.getFollowingURL());
        contentStream.newLine();

        contentStream.showText("gistsURL : "+user.getGistsURL());
        contentStream.newLine();

        contentStream.showText("starredURL : "+user.getStarredURL());
        contentStream.newLine();

        contentStream.showText("subscriptionsURL : "+user.getSubscriptionsURL());
        contentStream.newLine();

        contentStream.showText("organizationsURL : "+user.getOrganizationsURL());
        contentStream.newLine();

        contentStream.showText("reposURL : "+user.getReposURL());
        contentStream.newLine();

        contentStream.showText("eventsURL : "+user.getEventsURL());
        contentStream.newLine();

        contentStream.showText("receivedEventsURL : "+user.getReceivedEventsURL());
        contentStream.newLine();

        contentStream.showText("type : "+user.getType());
        contentStream.newLine();

        contentStream.showText("siteAdmin : "+user.getSiteAdmin().toString());
        contentStream.newLine();
    }
}
