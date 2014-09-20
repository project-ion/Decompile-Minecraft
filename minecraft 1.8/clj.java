/*   1:    */ import com.google.common.collect.Maps;
/*   2:    */ import java.util.LinkedHashMap;
/*   3:    */ import java.util.Map;
/*   4:    */ 
/*   5:    */ class clj
/*   6:    */   extends cnc
/*   7:    */ {
/*   8:    */   clj(clc paramclc) {}
/*   9:    */   
/*  10:    */   protected cxl a(bec parambec)
/*  11:    */   {
/*  12:250 */     LinkedHashMap localLinkedHashMap = Maps.newLinkedHashMap(parambec.b());
/*  13:    */     
/*  14:252 */     String str1 = ayl.M.a((Comparable)localLinkedHashMap.remove(ayl.M));
/*  15:253 */     localLinkedHashMap.remove(bbf.b);
/*  16:    */     
/*  17:255 */     String str2 = ((Boolean)parambec.b(ayl.b)).booleanValue() ? "all" : "normal";
/*  18:256 */     return new cxl(str1 + "_double_slab", str2);
/*  19:    */   }
/*  20:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     clj
 * JD-Core Version:    0.7.0.1
 */