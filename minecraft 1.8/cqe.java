/*  1:   */ public class cqe
/*  2:   */   extends cqz
/*  3:   */ {
/*  4:12 */   private static final oa j = new oa("textures/entity/steve.png");
/*  5:   */   protected ccl a;
/*  6:   */   protected float e;
/*  7:   */   
/*  8:   */   public cqe(cpt paramcpt, ccl paramccl, float paramFloat)
/*  9:   */   {
/* 10:18 */     this(paramcpt, paramccl, paramFloat, 1.0F);
/* 11:   */     
/* 12:20 */     a(new csn(this));
/* 13:   */   }
/* 14:   */   
/* 15:   */   public cqe(cpt paramcpt, ccl paramccl, float paramFloat1, float paramFloat2)
/* 16:   */   {
/* 17:24 */     super(paramcpt, paramccl, paramFloat1);
/* 18:25 */     this.a = paramccl;
/* 19:26 */     this.e = paramFloat2;
/* 20:   */     
/* 21:28 */     a(new csh(paramccl.e));
/* 22:   */   }
/* 23:   */   
/* 24:   */   protected oa a(xn paramxn)
/* 25:   */   {
/* 26:33 */     return j;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public void B_()
/* 30:   */   {
/* 31:38 */     cjm.b(0.0F, 0.1875F, 0.0F);
/* 32:   */   }
/* 33:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     cqe
 * JD-Core Version:    0.7.0.1
 */