/*   1:    */ import java.util.List;
/*   2:    */ import java.util.Random;
/*   3:    */ 
/*   4:    */ public class bjr
/*   5:    */   extends bkb
/*   6:    */ {
/*   7:    */   public bjr() {}
/*   8:    */   
/*   9:    */   public bjr(int paramInt, Random paramRandom, bjb parambjb, ej paramej)
/*  10:    */   {
/*  11:357 */     super(paramInt);
/*  12:    */     
/*  13:359 */     this.m = paramej;
/*  14:360 */     this.l = parambjb;
/*  15:    */   }
/*  16:    */   
/*  17:    */   public void a(bms parambms, List paramList, Random paramRandom)
/*  18:    */   {
/*  19:365 */     a((bkf)parambms, paramList, paramRandom, 1, 3, false);
/*  20:    */   }
/*  21:    */   
/*  22:    */   public static bjr a(List paramList, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, ej paramej, int paramInt4)
/*  23:    */   {
/*  24:369 */     bjb localbjb = bjb.a(paramInt1, paramInt2, paramInt3, -1, -3, 0, 5, 10, 19, paramej);
/*  25:371 */     if ((!a(localbjb)) || (bms.a(paramList, localbjb) != null)) {
/*  26:372 */       return null;
/*  27:    */     }
/*  28:375 */     return new bjr(paramInt4, paramRandom, localbjb, paramej);
/*  29:    */   }
/*  30:    */   
/*  31:    */   public boolean a(aqu paramaqu, Random paramRandom, bjb parambjb)
/*  32:    */   {
/*  33:381 */     a(paramaqu, parambjb, 0, 3, 0, 4, 4, 18, aty.by.P(), aty.by.P(), false);
/*  34:    */     
/*  35:383 */     a(paramaqu, parambjb, 1, 5, 0, 3, 7, 18, aty.a.P(), aty.a.P(), false);
/*  36:    */     
/*  37:    */ 
/*  38:386 */     a(paramaqu, parambjb, 0, 5, 0, 0, 5, 18, aty.by.P(), aty.by.P(), false);
/*  39:387 */     a(paramaqu, parambjb, 4, 5, 0, 4, 5, 18, aty.by.P(), aty.by.P(), false);
/*  40:    */     
/*  41:    */ 
/*  42:390 */     a(paramaqu, parambjb, 0, 2, 0, 4, 2, 5, aty.by.P(), aty.by.P(), false);
/*  43:391 */     a(paramaqu, parambjb, 0, 2, 13, 4, 2, 18, aty.by.P(), aty.by.P(), false);
/*  44:392 */     a(paramaqu, parambjb, 0, 0, 0, 4, 1, 3, aty.by.P(), aty.by.P(), false);
/*  45:393 */     a(paramaqu, parambjb, 0, 0, 15, 4, 1, 18, aty.by.P(), aty.by.P(), false);
/*  46:395 */     for (int i = 0; i <= 4; i++) {
/*  47:396 */       for (int j = 0; j <= 2; j++)
/*  48:    */       {
/*  49:397 */         b(paramaqu, aty.by.P(), i, -1, j, parambjb);
/*  50:398 */         b(paramaqu, aty.by.P(), i, -1, 18 - j, parambjb);
/*  51:    */       }
/*  52:    */     }
/*  53:402 */     a(paramaqu, parambjb, 0, 1, 1, 0, 4, 1, aty.bz.P(), aty.bz.P(), false);
/*  54:403 */     a(paramaqu, parambjb, 0, 3, 4, 0, 4, 4, aty.bz.P(), aty.bz.P(), false);
/*  55:404 */     a(paramaqu, parambjb, 0, 3, 14, 0, 4, 14, aty.bz.P(), aty.bz.P(), false);
/*  56:405 */     a(paramaqu, parambjb, 0, 1, 17, 0, 4, 17, aty.bz.P(), aty.bz.P(), false);
/*  57:406 */     a(paramaqu, parambjb, 4, 1, 1, 4, 4, 1, aty.bz.P(), aty.bz.P(), false);
/*  58:407 */     a(paramaqu, parambjb, 4, 3, 4, 4, 4, 4, aty.bz.P(), aty.bz.P(), false);
/*  59:408 */     a(paramaqu, parambjb, 4, 3, 14, 4, 4, 14, aty.bz.P(), aty.bz.P(), false);
/*  60:409 */     a(paramaqu, parambjb, 4, 1, 17, 4, 4, 17, aty.bz.P(), aty.bz.P(), false);
/*  61:    */     
/*  62:411 */     return true;
/*  63:    */   }
/*  64:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     bjr
 * JD-Core Version:    0.7.0.1
 */