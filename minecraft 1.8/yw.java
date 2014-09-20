/*  1:   */ import com.google.common.base.Predicate;
/*  2:   */ import com.google.common.base.Predicates;
/*  3:   */ import java.util.Random;
/*  4:   */ 
/*  5:   */ public class yw
/*  6:   */   extends zb
/*  7:   */ {
/*  8:22 */   private static final Predicate b = beq.a(aty.H).a(bbh.a, Predicates.equalTo(bbi.b));
/*  9:   */   private xn c;
/* 10:   */   private aqu d;
/* 11:   */   int a;
/* 12:   */   
/* 13:   */   public yw(xn paramxn)
/* 14:   */   {
/* 15:29 */     this.c = paramxn;
/* 16:30 */     this.d = paramxn.o;
/* 17:31 */     a(7);
/* 18:   */   }
/* 19:   */   
/* 20:   */   public boolean a()
/* 21:   */   {
/* 22:36 */     if (this.c.bb().nextInt(this.c.i_() ? 50 : 1000) != 0) {
/* 23:37 */       return false;
/* 24:   */     }
/* 25:40 */     dt localdt = new dt(this.c.s, this.c.t, this.c.u);
/* 26:41 */     if (b.apply(this.d.p(localdt))) {
/* 27:42 */       return true;
/* 28:   */     }
/* 29:44 */     if (this.d.p(localdt.b()).c() == aty.c) {
/* 30:45 */       return true;
/* 31:   */     }
/* 32:47 */     return false;
/* 33:   */   }
/* 34:   */   
/* 35:   */   public void c()
/* 36:   */   {
/* 37:52 */     this.a = 40;
/* 38:53 */     this.d.a(this.c, (byte)10);
/* 39:54 */     this.c.s().n();
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void d()
/* 43:   */   {
/* 44:59 */     this.a = 0;
/* 45:   */   }
/* 46:   */   
/* 47:   */   public boolean b()
/* 48:   */   {
/* 49:64 */     return this.a > 0;
/* 50:   */   }
/* 51:   */   
/* 52:   */   public int f()
/* 53:   */   {
/* 54:68 */     return this.a;
/* 55:   */   }
/* 56:   */   
/* 57:   */   public void e()
/* 58:   */   {
/* 59:73 */     this.a = Math.max(0, this.a - 1);
/* 60:74 */     if (this.a != 4) {
/* 61:75 */       return;
/* 62:   */     }
/* 63:78 */     dt localdt1 = new dt(this.c.s, this.c.t, this.c.u);
/* 64:80 */     if (b.apply(this.d.p(localdt1)))
/* 65:   */     {
/* 66:81 */       if (this.d.Q().b("mobGriefing")) {
/* 67:82 */         this.d.b(localdt1, false);
/* 68:   */       }
/* 69:84 */       this.c.v();
/* 70:   */     }
/* 71:   */     else
/* 72:   */     {
/* 73:86 */       dt localdt2 = localdt1.b();
/* 74:87 */       if (this.d.p(localdt2).c() == aty.c)
/* 75:   */       {
/* 76:88 */         if (this.d.Q().b("mobGriefing"))
/* 77:   */         {
/* 78:89 */           this.d.b(2001, localdt2, atr.a(aty.c));
/* 79:90 */           this.d.a(localdt2, aty.d.P(), 2);
/* 80:   */         }
/* 81:92 */         this.c.v();
/* 82:   */       }
/* 83:   */     }
/* 84:   */   }
/* 85:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     yw
 * JD-Core Version:    0.7.0.1
 */