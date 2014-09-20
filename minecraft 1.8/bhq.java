/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class bhq
/*  4:   */   extends bhp
/*  5:   */ {
/*  6:   */   private avy a;
/*  7:   */   private bec b;
/*  8:   */   
/*  9:   */   public bhq(avy paramavy, awa paramawa)
/* 10:   */   {
/* 11:16 */     a(paramavy, paramawa);
/* 12:   */   }
/* 13:   */   
/* 14:   */   public void a(avy paramavy, awa paramawa)
/* 15:   */   {
/* 16:20 */     this.a = paramavy;
/* 17:21 */     this.b = paramavy.P().a(paramavy.l(), paramawa);
/* 18:   */   }
/* 19:   */   
/* 20:   */   public boolean b(aqu paramaqu, Random paramRandom, dt paramdt)
/* 21:   */   {
/* 22:26 */     for (int i = 0; i < 64; i++)
/* 23:   */     {
/* 24:27 */       dt localdt = paramdt.a(paramRandom.nextInt(8) - paramRandom.nextInt(8), paramRandom.nextInt(4) - paramRandom.nextInt(4), paramRandom.nextInt(8) - paramRandom.nextInt(8));
/* 25:28 */       if ((paramaqu.d(localdt)) && ((!paramaqu.t.o()) || (localdt.o() < 255)) && 
/* 26:29 */         (this.a.f(paramaqu, localdt, this.b))) {
/* 27:30 */         paramaqu.a(localdt, this.b, 2);
/* 28:   */       }
/* 29:   */     }
/* 30:35 */     return true;
/* 31:   */   }
/* 32:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     bhq
 * JD-Core Version:    0.7.0.1
 */