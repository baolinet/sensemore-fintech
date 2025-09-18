package com.sensemore.loan.domain.ai_core;

import java.util.Map;

public class KnowledgeDomain {

    
    public void createKnowledgeBase() {
        // 知识库-公司/业务线/团队/项目等
    }

    
    public void createKnowledgeSpace(){
        // 知识库中的知识空间-部门/岗位/领域等
    }

    public void createKnowledgeDoc(){
        // 知识库中的知识文档-文章/FAQ/视频等
    }

    public void addKnowledge() {
        
    }

    public void queryKnowledge() {
        
    }

    public void deleteKnowledge() {
        
    }

    public void queryKnowledgeMeta(){

    }

    public void updateKnowledgeMeta(){
        
    }

     public static abstract class DocumentLoader {
        private String documentId;
        private String documentName;
        private String docFormat; // Record, markdown, pdf, html,word, excel, csv
        private String loaderType; //api, mysql, sftp, s3, web, wiki
        private Map<String, Object> queryParams;
        
        public abstract void load();
    }

    public static class ApiDocumentLoader extends DocumentLoader {
        private String apiUrl;
        private String apiType; //Post, Get

        @Override
        public void load() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'load'");
        }
    }

    public static class MysqlDocumentLoader extends DocumentLoader {
        private String msyqlSourceUrl;
        private String mysqlUser;
        private String mysqlPassword;
        private String sqlTemplate;

        @Override
        public void load() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'load'");
        }
    }

    public static class SftpDocumentLoader extends DocumentLoader {
        private String sftpServer;
        private String sftpUser;
        private String sftpPassword;

        @Override
        public void load() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'load'");
        }
    }


    public static class S3DocumentLoader extends DocumentLoader {
        private String s3filePath;
        private String s3AccessToken;

        @Override
        public void load() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'load'");
        }
    }

    public static class WebDocumentLoader extends DocumentLoader {
        private String webUrl;
        private String accessToken;

        @Override
        public void load() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'load'");
        }
    }

    public static class WikiDocumentLoader extends DocumentLoader {

        private String wikiUrl;
        private String accessToken;
        @Override
        public void load() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'load'");
        }
    }
}
