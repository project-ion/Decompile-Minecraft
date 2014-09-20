/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class aht
/*  4:   */   extends ahr
/*  5:   */ {
/*  6:   */   public aht(aqu paramaqu, xm paramxm)
/*  7:   */   {
/*  8:15 */     super(paramaqu, paramxm);
/*  9:   */   }
/* 10:   */   
/* 11:   */   public aht(aqu paramaqu, double paramDouble1, double paramDouble2, double paramDouble3)
/* 12:   */   {
/* 13:19 */     super(paramaqu, paramDouble1, paramDouble2, paramDouble3);
/* 14:   */   }
/* 15:   */   
/* 16:   */   protected void a(bru parambru)
/* 17:   */   {
/* 18:24 */     xm localxm = n();
/* 19:26 */     if (parambru.d != null) {
/* 20:27 */       parambru.d.a(wh.a(this, localxm), 0.0F);
/* 21:   */     }
/* 22:30 */     for (int i = 0; i < 32; i++) {
/* 23:31 */       this.o.a(ew.y, this.s, this.t + this.V.nextDouble() * 2.0D, this.u, this.V.nextGaussian(), 0.0D, this.V.nextGaussian(), new int[0]);
/* 24:   */     }
/* 25:34 */     if (!this.o.D)
/* 26:   */     {
/* 27:35 */       if ((localxm instanceof qw))
/* 28:   */       {
/* 29:36 */         qw localqw = (qw)localxm;
/* 30:38 */         if ((localqw.a.a().g()) && (localqw.o == this.o) && (!localqw.bI()))
/* 31:   */         {
/* 32:39 */           if ((this.V.nextFloat() < 0.05F) && (this.o.Q().b("doMobSpawning")))
/* 33:   */           {
/* 34:40 */             aew localaew = new aew(this.o);
/* 35:41 */             localaew.a(true);
/* 36:42 */             localaew.b(localxm.s, localxm.t, localxm.u, localxm.y, localxm.z);
/* 37:43 */             this.o.d(localaew);
/* 38:   */           }
/* 39:46 */           if (localxm.av()) {
/* 40:47 */             localxm.a(null);
/* 41:   */           }
/* 42:49 */           localxm.a(this.s, this.t, this.u);
/* 43:50 */           localxm.O = 0.0F;
/* 44:51 */           localxm.a(wh.i, 5.0F);
/* 45:   */         }
/* 46:   */       }
/* 47:54 */       J();
/* 48:   */     }
/* 49:   */   }
/* 50:   */   
/* 51:   */   public void s_()
/* 52:   */   {
/* 53:60 */     xm localxm = n();
/* 54:61 */     if ((localxm != null) && ((localxm instanceof ahd)) && (!localxm.ai())) {
/* 55:62 */       J();
/* 56:   */     } else {
/* 57:64 */       super.s_();
/* 58:   */     }
/* 59:   */   }
/* 60:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     aht
 * JD-Core Version:    0.7.0.1
 */