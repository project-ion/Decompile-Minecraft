/*   1:    */ import com.google.common.collect.Maps;
/*   2:    */ import java.util.LinkedHashMap;
/*   3:    */ import java.util.Map;
/*   4:    */ 
/*   5:    */ class clg
/*   6:    */   extends cnc
/*   7:    */ {
/*   8:    */   clg(clc paramclc) {}
/*   9:    */   
/*  10:    */   protected cxl a(bec parambec)
/*  11:    */   {
/*  12:211 */     LinkedHashMap localLinkedHashMap = Maps.newLinkedHashMap(parambec.b());
/*  13:213 */     if (parambec.b(bay.b) != ej.b) {
/*  14:214 */       localLinkedHashMap.remove(bay.a);
/*  15:    */     }
/*  16:216 */     return new cxl((oa)atr.c.c(parambec.c()), a(localLinkedHashMap));
/*  17:    */   }
/*  18:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     clg
 * JD-Core Version:    0.7.0.1
 */