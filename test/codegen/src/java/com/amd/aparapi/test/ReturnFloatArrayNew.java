package com.syncleus.aparapi.test;

public class ReturnFloatArrayNew{

   float[] returnFloatArrayNew() {
      return new float[1024];
   }

   public void run() {
      returnFloatArrayNew();
   }
}
/**{Throws{ClassParseException}Throws}**/
