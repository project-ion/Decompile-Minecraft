/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public abstract class bhc
/*  4:   */   extends bhp
/*  5:   */ {
/*  6:   */   public bhc(boolean paramBoolean)
/*  7:   */   {
/*  8:13 */     super(paramBoolean);
/*  9:   */   }
/* 10:   */   
/* 11:   */   protected boolean a(atr paramatr)
/* 12:   */   {
/* 13:17 */     return (paramatr.r() == bof.a) || (paramatr.r() == bof.j) || (paramatr == aty.c) || (paramatr == aty.d) || (paramatr == aty.r) || (paramatr == aty.s) || (paramatr == aty.g) || (paramatr == aty.bn);
/* 14:   */   }
/* 15:   */   
/* 16:   */   public void a(aqu paramaqu, Random paramRandom, dt paramdt) {}
/* 17:   */   
/* 18:   */   protected void a(aqu paramaqu, dt paramdt)
/* 19:   */   {
/* 20:25 */     if (paramaqu.p(paramdt).c() != aty.d) {
/* 21:26 */       a(paramaqu, paramdt, aty.d.P());
/* 22:   */     }
/* 23:   */   }
/* 24:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     bhc
 * JD-Core Version:    0.7.0.1
 */