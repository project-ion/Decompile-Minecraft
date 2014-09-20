/*  1:   */ public class bru
/*  2:   */ {
/*  3:   */   private dt e;
/*  4:   */   public brv a;
/*  5:   */   public ej b;
/*  6:   */   public brw c;
/*  7:   */   public wv d;
/*  8:   */   
/*  9:   */   public bru(brw parambrw, ej paramej, dt paramdt)
/* 10:   */   {
/* 11:19 */     this(brv.b, parambrw, paramej, paramdt);
/* 12:   */   }
/* 13:   */   
/* 14:   */   public bru(brw parambrw, ej paramej)
/* 15:   */   {
/* 16:23 */     this(brv.b, parambrw, paramej, dt.a);
/* 17:   */   }
/* 18:   */   
/* 19:   */   public bru(wv paramwv)
/* 20:   */   {
/* 21:27 */     this(paramwv, new brw(paramwv.s, paramwv.t, paramwv.u));
/* 22:   */   }
/* 23:   */   
/* 24:   */   public bru(brv parambrv, brw parambrw, ej paramej, dt paramdt)
/* 25:   */   {
/* 26:31 */     this.a = parambrv;
/* 27:32 */     this.e = paramdt;
/* 28:33 */     this.b = paramej;
/* 29:34 */     this.c = new brw(parambrw.a, parambrw.b, parambrw.c);
/* 30:   */   }
/* 31:   */   
/* 32:   */   public bru(wv paramwv, brw parambrw)
/* 33:   */   {
/* 34:38 */     this.a = brv.c;
/* 35:39 */     this.d = paramwv;
/* 36:40 */     this.c = parambrw;
/* 37:   */   }
/* 38:   */   
/* 39:   */   public dt a()
/* 40:   */   {
/* 41:51 */     return this.e;
/* 42:   */   }
/* 43:   */   
/* 44:   */   public String toString()
/* 45:   */   {
/* 46:56 */     return "HitResult{type=" + this.a + ", blockpos=" + this.e + ", f=" + this.b + ", pos=" + this.c + ", entity=" + this.d + '}';
/* 47:   */   }
/* 48:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     bru
 * JD-Core Version:    0.7.0.1
 */