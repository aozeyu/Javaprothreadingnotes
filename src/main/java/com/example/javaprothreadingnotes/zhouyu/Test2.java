package com.example.javaprothreadingnotes.zhouyu;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test2 {
  String sonnet = "From fairest creatures we desire increase,\n" +
      "That thereby beauty's rose might never die,\n" +
      "But as the riper should by time decease\n" +
      "His tender heir might bear his memory:\n" +
      "But thou, contracted to thine own bright eyes,\n" +
      "Feed'st thy light's flame with self-substantial fuel,\n" +
      "Making a famine where abundance lies,\n" +
      "Thyself thy foe, to thy sweet self too cruel.\n" +
      "Thou that art now the world's fresh ornament,\n" +
      "And only herald to the gaudy spring,\n" +
      "Within thine own bud buriest thy content,\n" +
      "And, tender churl, mak'st waste in niggardly.\n" +
      "Pity the world, or else this glutton be,\n" +
      "To eat the world's due, by the grave and thee.";
  Pattern pattern = Pattern.compile("\\bfame\\b");
  Matcher matcher = Pattern.matcher(sonnet);
  while (matcher.find()) {
    String group = matcher.group();
    int start = matcher.start();
    int end = matcher.end();
    System.out.println(group + " " + start + " " + end);
  }
}
