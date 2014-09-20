/*  1:   */ public class md
/*  2:   */   implements id
/*  3:   */ {
/*  4:   */   private int a;
/*  5:   */   private me b;
/*  6:   */   private brw c;
/*  7:   */   
/*  8:   */   public md() {}
/*  9:   */   
/* 10:   */   public md(wv paramwv, me paramme)
/* 11:   */   {
/* 12:21 */     this.a = paramwv.F();
/* 13:22 */     this.b = paramme;
/* 14:   */   }
/* 15:   */   
/* 16:   */   public md(wv paramwv, brw parambrw)
/* 17:   */   {
/* 18:26 */     this(paramwv, me.c);
/* 19:27 */     this.c = parambrw;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void a(hd paramhd)
/* 23:   */   {
/* 24:32 */     this.a = paramhd.e();
/* 25:33 */     this.b = ((me)paramhd.a(me.class));
/* 26:34 */     if (this.b == me.c) {
/* 27:35 */       this.c = new brw(paramhd.readFloat(), paramhd.readFloat(), paramhd.readFloat());
/* 28:   */     }
/* 29:   */   }
/* 30:   */   
/* 31:   */   public void b(hd paramhd)
/* 32:   */   {
/* 33:41 */     paramhd.b(this.a);
/* 34:42 */     paramhd.a(this.b);
/* 35:43 */     if (this.b == me.c)
/* 36:   */     {
/* 37:44 */       paramhd.writeFloat((float)this.c.a);
/* 38:45 */       paramhd.writeFloat((float)this.c.b);
/* 39:46 */       paramhd.writeFloat((float)this.c.c);
/* 40:   */     }
/* 41:   */   }
/* 42:   */   
/* 43:   */   public void a(ls paramls)
/* 44:   */   {
/* 45:52 */     paramls.a(this);
/* 46:   */   }
/* 47:   */   
/* 48:   */   public wv a(aqu paramaqu)
/* 49:   */   {
/* 50:56 */     return paramaqu.a(this.a);
/* 51:   */   }
/* 52:   */   
/* 53:   */   public me a()
/* 54:   */   {
/* 55:60 */     return this.b;
/* 56:   */   }
/* 57:   */   
/* 58:   */   public brw b()
/* 59:   */   {
/* 60:64 */     return this.c;
/* 61:   */   }
/* 62:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     md
 * JD-Core Version:    0.7.0.1
 */