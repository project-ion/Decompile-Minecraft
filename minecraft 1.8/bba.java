/*  1:   */ import java.util.List;
/*  2:   */ import java.util.Random;
/*  3:   */ 
/*  4:   */ public class bba
/*  5:   */   extends atr
/*  6:   */ {
/*  7:17 */   public static final bev a = bev.a("variant", bbb.class);
/*  8:   */   
/*  9:   */   public bba()
/* 10:   */   {
/* 11:20 */     super(bof.e);
/* 12:21 */     j(this.L.b().a(a, bbb.a));
/* 13:22 */     a(akf.b);
/* 14:   */   }
/* 15:   */   
/* 16:   */   public alq a(bec parambec, Random paramRandom, int paramInt)
/* 17:   */   {
/* 18:28 */     if (parambec.b(a) == bbb.a) {
/* 19:29 */       return alq.a(aty.e);
/* 20:   */     }
/* 21:31 */     return alq.a(aty.b);
/* 22:   */   }
/* 23:   */   
/* 24:   */   public int a(bec parambec)
/* 25:   */   {
/* 26:36 */     return ((bbb)parambec.b(a)).a();
/* 27:   */   }
/* 28:   */   
/* 29:   */   public void a(alq paramalq, akf paramakf, List paramList)
/* 30:   */   {
/* 31:41 */     for (bbb localbbb : ) {
/* 32:42 */       paramList.add(new amj(paramalq, 1, localbbb.a()));
/* 33:   */     }
/* 34:   */   }
/* 35:   */   
/* 36:   */   public bec a(int paramInt)
/* 37:   */   {
/* 38:48 */     return P().a(a, bbb.a(paramInt));
/* 39:   */   }
/* 40:   */   
/* 41:   */   public int c(bec parambec)
/* 42:   */   {
/* 43:54 */     return ((bbb)parambec.b(a)).a();
/* 44:   */   }
/* 45:   */   
/* 46:   */   protected bed e()
/* 47:   */   {
/* 48:59 */     return new bed(this, new bex[] { a });
/* 49:   */   }
/* 50:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     bba
 * JD-Core Version:    0.7.0.1
 */