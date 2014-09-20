/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ public class akb
/*   4:    */   extends alq
/*   5:    */ {
/*   6:    */   private atr a;
/*   7:    */   
/*   8:    */   public akb(atr paramatr)
/*   9:    */   {
/*  10: 19 */     this.h = 1;
/*  11: 20 */     this.a = paramatr;
/*  12: 21 */     a(akf.f);
/*  13:    */   }
/*  14:    */   
/*  15:    */   public amj a(amj paramamj, aqu paramaqu, ahd paramahd)
/*  16:    */   {
/*  17: 26 */     boolean bool = this.a == aty.a;
/*  18:    */     
/*  19: 28 */     bru localbru = a(paramaqu, paramahd, bool);
/*  20: 29 */     if (localbru == null) {
/*  21: 30 */       return paramamj;
/*  22:    */     }
/*  23: 33 */     if (localbru.a == brv.b)
/*  24:    */     {
/*  25: 34 */       dt localdt = localbru.a();
/*  26: 36 */       if (!paramaqu.a(paramahd, localdt)) {
/*  27: 37 */         return paramamj;
/*  28:    */       }
/*  29:    */       Object localObject;
/*  30: 40 */       if (bool)
/*  31:    */       {
/*  32: 41 */         if (!paramahd.a(localdt.a(localbru.b), localbru.b, paramamj)) {
/*  33: 42 */           return paramamj;
/*  34:    */         }
/*  35: 44 */         localObject = paramaqu.p(localdt);
/*  36: 45 */         bof localbof = ((bec)localObject).c().r();
/*  37: 47 */         if ((localbof == bof.h) && (((Integer)((bec)localObject).b(axl.b)).intValue() == 0))
/*  38:    */         {
/*  39: 48 */           paramaqu.g(localdt);
/*  40: 49 */           paramahd.b(ty.J[alq.b(this)]);
/*  41: 50 */           return a(paramamj, paramahd, amk.ax);
/*  42:    */         }
/*  43: 53 */         if ((localbof == bof.i) && (((Integer)((bec)localObject).b(axl.b)).intValue() == 0))
/*  44:    */         {
/*  45: 54 */           paramaqu.g(localdt);
/*  46: 55 */           paramahd.b(ty.J[alq.b(this)]);
/*  47: 56 */           return a(paramamj, paramahd, amk.ay);
/*  48:    */         }
/*  49:    */       }
/*  50:    */       else
/*  51:    */       {
/*  52: 58 */         if (this.a == aty.a) {
/*  53: 59 */           return new amj(amk.aw);
/*  54:    */         }
/*  55: 61 */         localObject = localdt.a(localbru.b);
/*  56: 63 */         if (!paramahd.a((dt)localObject, localbru.b, paramamj)) {
/*  57: 64 */           return paramamj;
/*  58:    */         }
/*  59: 67 */         if ((a(paramaqu, (dt)localObject)) && (!paramahd.by.d))
/*  60:    */         {
/*  61: 68 */           paramahd.b(ty.J[alq.b(this)]);
/*  62: 69 */           return new amj(amk.aw);
/*  63:    */         }
/*  64:    */       }
/*  65:    */     }
/*  66: 74 */     return paramamj;
/*  67:    */   }
/*  68:    */   
/*  69:    */   private amj a(amj paramamj, ahd paramahd, alq paramalq)
/*  70:    */   {
/*  71: 78 */     if (paramahd.by.d) {
/*  72: 79 */       return paramamj;
/*  73:    */     }
/*  74: 82 */     if (--paramamj.b <= 0) {
/*  75: 83 */       return new amj(paramalq);
/*  76:    */     }
/*  77: 85 */     if (!paramahd.bg.a(new amj(paramalq))) {
/*  78: 86 */       paramahd.a(new amj(paramalq, 1, 0), false);
/*  79:    */     }
/*  80: 88 */     return paramamj;
/*  81:    */   }
/*  82:    */   
/*  83:    */   public boolean a(aqu paramaqu, dt paramdt)
/*  84:    */   {
/*  85: 93 */     if (this.a == aty.a) {
/*  86: 94 */       return false;
/*  87:    */     }
/*  88: 97 */     bof localbof = paramaqu.p(paramdt).c().r();
/*  89: 98 */     int i = !localbof.a() ? 1 : 0;
/*  90: 99 */     if ((paramaqu.d(paramdt)) || (i != 0))
/*  91:    */     {
/*  92:100 */       if ((paramaqu.t.n()) && (this.a == aty.i))
/*  93:    */       {
/*  94:101 */         int j = paramdt.n();
/*  95:102 */         int k = paramdt.o();
/*  96:103 */         int m = paramdt.p();
/*  97:    */         
/*  98:105 */         paramaqu.a(j + 0.5F, k + 0.5F, m + 0.5F, "random.fizz", 0.5F, 2.6F + (paramaqu.s.nextFloat() - paramaqu.s.nextFloat()) * 0.8F);
/*  99:107 */         for (int n = 0; n < 8; n++) {
/* 100:108 */           paramaqu.a(ew.m, j + Math.random(), k + Math.random(), m + Math.random(), 0.0D, 0.0D, 0.0D, new int[0]);
/* 101:    */         }
/* 102:    */       }
/* 103:    */       else
/* 104:    */       {
/* 105:111 */         if ((!paramaqu.D) && (i != 0) && (!localbof.d())) {
/* 106:112 */           paramaqu.b(paramdt, true);
/* 107:    */         }
/* 108:115 */         paramaqu.a(paramdt, this.a.P(), 3);
/* 109:    */       }
/* 110:118 */       return true;
/* 111:    */     }
/* 112:121 */     return false;
/* 113:    */   }
/* 114:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     akb
 * JD-Core Version:    0.7.0.1
 */