/*  1:   */ import java.util.List;
/*  2:   */ import java.util.Random;
/*  3:   */ 
/*  4:   */ public class ads
/*  5:   */   extends adr
/*  6:   */ {
/*  7:   */   private int b;
/*  8:   */   public long a;
/*  9:   */   private int c;
/* 10:   */   
/* 11:   */   public ads(aqu paramaqu, double paramDouble1, double paramDouble2, double paramDouble3)
/* 12:   */   {
/* 13:23 */     super(paramaqu);
/* 14:24 */     b(paramDouble1, paramDouble2, paramDouble3, 0.0F, 0.0F);
/* 15:25 */     this.b = 2;
/* 16:26 */     this.a = this.V.nextLong();
/* 17:27 */     this.c = (this.V.nextInt(3) + 1);
/* 18:29 */     if ((!paramaqu.D) && (paramaqu.Q().b("doFireTick")) && ((paramaqu.aa() == vt.c) || (paramaqu.aa() == vt.d)) && (paramaqu.a(new dt(this), 10)))
/* 19:   */     {
/* 20:30 */       dt localdt1 = new dt(this);
/* 21:32 */       if ((paramaqu.p(localdt1).c().r() == bof.a) && (aty.ab.c(paramaqu, localdt1))) {
/* 22:33 */         paramaqu.a(localdt1, aty.ab.P());
/* 23:   */       }
/* 24:37 */       for (int i = 0; i < 4; i++)
/* 25:   */       {
/* 26:38 */         dt localdt2 = localdt1.a(this.V.nextInt(3) - 1, this.V.nextInt(3) - 1, this.V.nextInt(3) - 1);
/* 27:39 */         if ((paramaqu.p(localdt2).c().r() == bof.a) && (aty.ab.c(paramaqu, localdt2))) {
/* 28:40 */           paramaqu.a(localdt2, aty.ab.P());
/* 29:   */         }
/* 30:   */       }
/* 31:   */     }
/* 32:   */   }
/* 33:   */   
/* 34:   */   public void s_()
/* 35:   */   {
/* 36:48 */     super.s_();
/* 37:50 */     if (this.b == 2)
/* 38:   */     {
/* 39:51 */       this.o.a(this.s, this.t, this.u, "ambient.weather.thunder", 10000.0F, 0.8F + this.V.nextFloat() * 0.2F);
/* 40:52 */       this.o.a(this.s, this.t, this.u, "random.explode", 2.0F, 0.5F + this.V.nextFloat() * 0.2F);
/* 41:   */     }
/* 42:55 */     this.b -= 1;
/* 43:56 */     if (this.b < 0) {
/* 44:57 */       if (this.c == 0)
/* 45:   */       {
/* 46:58 */         J();
/* 47:   */       }
/* 48:59 */       else if (this.b < -this.V.nextInt(10))
/* 49:   */       {
/* 50:60 */         this.c -= 1;
/* 51:61 */         this.b = 1;
/* 52:62 */         this.a = this.V.nextLong();
/* 53:63 */         dt localdt = new dt(this);
/* 54:64 */         if ((!this.o.D) && (this.o.Q().b("doFireTick")) && (this.o.a(localdt, 10)) && 
/* 55:65 */           (this.o.p(localdt).c().r() == bof.a) && (aty.ab.c(this.o, localdt))) {
/* 56:66 */           this.o.a(localdt, aty.ab.P());
/* 57:   */         }
/* 58:   */       }
/* 59:   */     }
/* 60:72 */     if (this.b >= 0) {
/* 61:73 */       if (this.o.D)
/* 62:   */       {
/* 63:74 */         this.o.c(2);
/* 64:   */       }
/* 65:   */       else
/* 66:   */       {
/* 67:76 */         double d = 3.0D;
/* 68:77 */         List localList = this.o.b(this, new brt(this.s - d, this.t - d, this.u - d, this.s + d, this.t + 6.0D + d, this.u + d));
/* 69:78 */         for (int i = 0; i < localList.size(); i++)
/* 70:   */         {
/* 71:79 */           wv localwv = (wv)localList.get(i);
/* 72:80 */           localwv.a(this);
/* 73:   */         }
/* 74:   */       }
/* 75:   */     }
/* 76:   */   }
/* 77:   */   
/* 78:   */   protected void h() {}
/* 79:   */   
/* 80:   */   protected void a(fn paramfn) {}
/* 81:   */   
/* 82:   */   protected void b(fn paramfn) {}
/* 83:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     ads
 * JD-Core Version:    0.7.0.1
 */