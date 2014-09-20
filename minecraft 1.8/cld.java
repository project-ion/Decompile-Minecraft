/*   1:    */ class cld
/*   2:    */   extends cnc
/*   3:    */ {
/*   4:    */   cld(clc paramclc) {}
/*   5:    */   
/*   6:    */   protected cxl a(bec parambec)
/*   7:    */   {
/*   8:172 */     azn localazn = (azn)parambec.b(azl.a);
/*   9:173 */     switch (clk.a[localazn.ordinal()])
/*  10:    */     {
/*  11:    */     case 1: 
/*  12:    */     default: 
/*  13:176 */       return new cxl("quartz_block", "normal");
/*  14:    */     case 2: 
/*  15:178 */       return new cxl("chiseled_quartz_block", "normal");
/*  16:    */     case 3: 
/*  17:180 */       return new cxl("quartz_column", "axis=y");
/*  18:    */     case 4: 
/*  19:182 */       return new cxl("quartz_column", "axis=x");
/*  20:    */     }
/*  21:184 */     return new cxl("quartz_column", "axis=z");
/*  22:    */   }
/*  23:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     cld
 * JD-Core Version:    0.7.0.1
 */