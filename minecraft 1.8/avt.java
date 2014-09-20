/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class avt
/*  4:   */   extends atr
/*  5:   */ {
/*  6:   */   public static boolean M;
/*  7:   */   
/*  8:   */   public avt()
/*  9:   */   {
/* 10:16 */     super(bof.p);
/* 11:17 */     a(akf.b);
/* 12:   */   }
/* 13:   */   
/* 14:   */   public avt(bof parambof)
/* 15:   */   {
/* 16:21 */     super(parambof);
/* 17:   */   }
/* 18:   */   
/* 19:   */   public void c(aqu paramaqu, dt paramdt, bec parambec)
/* 20:   */   {
/* 21:26 */     paramaqu.a(paramdt, this, a(paramaqu));
/* 22:   */   }
/* 23:   */   
/* 24:   */   public void a(aqu paramaqu, dt paramdt, bec parambec, atr paramatr)
/* 25:   */   {
/* 26:31 */     paramaqu.a(paramdt, this, a(paramaqu));
/* 27:   */   }
/* 28:   */   
/* 29:   */   public void b(aqu paramaqu, dt paramdt, bec parambec, Random paramRandom)
/* 30:   */   {
/* 31:36 */     if (!paramaqu.D) {
/* 32:37 */       e(paramaqu, paramdt);
/* 33:   */     }
/* 34:   */   }
/* 35:   */   
/* 36:   */   private void e(aqu paramaqu, dt paramdt)
/* 37:   */   {
/* 38:42 */     if ((!d(paramaqu, paramdt.b())) || (paramdt.o() < 0)) {
/* 39:43 */       return;
/* 40:   */     }
/* 41:46 */     int i = 32;
/* 42:   */     Object localObject;
/* 43:47 */     if ((M) || (!paramaqu.a(paramdt.a(-i, -i, -i), paramdt.a(i, i, i))))
/* 44:   */     {
/* 45:48 */       paramaqu.g(paramdt);
/* 46:   */       
/* 47:50 */       localObject = paramdt.b();
/* 48:51 */       while ((d(paramaqu, (dt)localObject)) && (((dt)localObject).o() > 0)) {
/* 49:52 */         localObject = ((dt)localObject).b();
/* 50:   */       }
/* 51:54 */       if (((dt)localObject).o() > 0) {
/* 52:56 */         paramaqu.a(((dt)localObject).a(), P());
/* 53:   */       }
/* 54:   */     }
/* 55:58 */     else if (!paramaqu.D)
/* 56:   */     {
/* 57:59 */       localObject = new adv(paramaqu, paramdt.n() + 0.5D, paramdt.o(), paramdt.p() + 0.5D, paramaqu.p(paramdt));
/* 58:60 */       a((adv)localObject);
/* 59:61 */       paramaqu.d((wv)localObject);
/* 60:   */     }
/* 61:   */   }
/* 62:   */   
/* 63:   */   protected void a(adv paramadv) {}
/* 64:   */   
/* 65:   */   public int a(aqu paramaqu)
/* 66:   */   {
/* 67:70 */     return 2;
/* 68:   */   }
/* 69:   */   
/* 70:   */   public static boolean d(aqu paramaqu, dt paramdt)
/* 71:   */   {
/* 72:75 */     atr localatr = paramaqu.p(paramdt).c();
/* 73:76 */     bof localbof = localatr.J;
/* 74:77 */     return (localatr == aty.ab) || (localbof == bof.a) || (localbof == bof.h) || (localbof == bof.i);
/* 75:   */   }
/* 76:   */   
/* 77:   */   public void a_(aqu paramaqu, dt paramdt) {}
/* 78:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     avt
 * JD-Core Version:    0.7.0.1
 */