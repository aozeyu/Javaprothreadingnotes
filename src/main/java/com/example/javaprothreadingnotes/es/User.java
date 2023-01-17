package com.example.javaprothreadingnotes.es;


import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.DateFormat;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.time.LocalDateTime;

@Document(indexName = "user",shards = 3,replicas = 0)
public class User {
  @Id
  private Integer id;
  @Field(type = FieldType.Keyword)
  private String name;
  @Field(type = FieldType.Integer)
  private Integer age;
  @Field(type = FieldType.Text, analyzer = "ik_max_word")
  private String address;
  @Field(type = FieldType.Date, format = DateFormat.custom, pattern = "uuuu-MM-dd'T'HH:mm:ss.SSSX")
  private LocalDateTime createTime;
}
