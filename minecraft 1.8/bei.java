/*  1:   */ import com.google.common.base.Predicate;
/*  2:   */ 
/*  3:   */ public class bei
/*  4:   */ {
/*  5:   */   private final aqu a;
/*  6:   */   private final dt b;
/*  7:   */   private bec c;
/*  8:   */   private bcm d;
/*  9:   */   private boolean e;
/* 10:   */   
/* 11:   */   public bei(aqu paramaqu, dt paramdt)
/* 12:   */   {
/* 13:19 */     this.a = paramaqu;
/* 14:20 */     this.b = paramdt;
/* 15:   */   }
/* 16:   */   
/* 17:   */   public bec a()
/* 18:   */   {
/* 19:24 */     if ((this.c == null) && (this.a.e(this.b))) {
/* 20:25 */       this.c = this.a.p(this.b);
/* 21:   */     }
/* 22:28 */     return this.c;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public bcm b()
/* 26:   */   {
/* 27:33 */     if ((this.d == null) && (!this.e))
/* 28:   */     {
/* 29:34 */       this.d = this.a.s(this.b);
/* 30:35 */       this.e = true;
/* 31:   */     }
/* 32:38 */     return this.d;
/* 33:   */   }
/* 34:   */   
/* 35:   */   public dt d()
/* 36:   */   {
/* 37:46 */     return this.b;
/* 38:   */   }
/* 39:   */   
/* 40:   */   public static Predicate a(Predicate paramPredicate)
/* 41:   */   {
/* 42:50 */     return new bej(paramPredicate);
/* 43:   */   }
/* 44:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     bei
 * JD-Core Version:    0.7.0.1
 */