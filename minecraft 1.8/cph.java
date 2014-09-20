/*  1:   */ public class cph
/*  2:   */   extends cqz
/*  3:   */ {
/*  4:10 */   private static final oa a = new oa("textures/entity/bat.png");
/*  5:   */   
/*  6:   */   public cph(cpt paramcpt)
/*  7:   */   {
/*  8:13 */     super(paramcpt, new cbx(), 0.25F);
/*  9:   */   }
/* 10:   */   
/* 11:   */   protected oa a(abo paramabo)
/* 12:   */   {
/* 13:18 */     return a;
/* 14:   */   }
/* 15:   */   
/* 16:   */   protected void a(abo paramabo, float paramFloat)
/* 17:   */   {
/* 18:23 */     cjm.a(0.35F, 0.35F, 0.35F);
/* 19:   */   }
/* 20:   */   
/* 21:   */   protected void a(abo paramabo, float paramFloat1, float paramFloat2, float paramFloat3)
/* 22:   */   {
/* 23:28 */     if (!paramabo.n()) {
/* 24:29 */       cjm.b(0.0F, uv.b(paramFloat1 * 0.3F) * 0.1F, 0.0F);
/* 25:   */     } else {
/* 26:31 */       cjm.b(0.0F, -0.1F, 0.0F);
/* 27:   */     }
/* 28:33 */     super.a(paramabo, paramFloat1, paramFloat2, paramFloat3);
/* 29:   */   }
/* 30:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     cph
 * JD-Core Version:    0.7.0.1
 */