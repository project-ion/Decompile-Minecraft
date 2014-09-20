/*   1:    */ import com.google.common.collect.Maps;
/*   2:    */ import java.util.LinkedHashMap;
/*   3:    */ import java.util.Map;
/*   4:    */ 
/*   5:    */ class cli
/*   6:    */   extends cnc
/*   7:    */ {
/*   8:    */   cli(clc paramclc) {}
/*   9:    */   
/*  10:    */   protected cxl a(bec parambec)
/*  11:    */   {
/*  12:237 */     LinkedHashMap localLinkedHashMap = Maps.newLinkedHashMap(parambec.b());
/*  13:    */     
/*  14:239 */     String str1 = bbf.M.a((Comparable)localLinkedHashMap.remove(bbf.M));
/*  15:240 */     localLinkedHashMap.remove(bbf.b);
/*  16:    */     
/*  17:242 */     String str2 = ((Boolean)parambec.b(bbf.b)).booleanValue() ? "all" : "normal";
/*  18:243 */     return new cxl(str1 + "_double_slab", str2);
/*  19:    */   }
/*  20:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     cli
 * JD-Core Version:    0.7.0.1
 */