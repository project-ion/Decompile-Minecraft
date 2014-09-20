/*   1:    */ import java.util.Iterator;
/*   2:    */ import java.util.List;
/*   3:    */ 
/*   4:    */ public class adl
/*   5:    */   extends adj
/*   6:    */ {
/*   7:    */   public adl(aqu paramaqu)
/*   8:    */   {
/*   9: 24 */     super(paramaqu);
/*  10:    */   }
/*  11:    */   
/*  12:    */   public adl(aqu paramaqu, dt paramdt)
/*  13:    */   {
/*  14: 28 */     super(paramaqu, paramdt);
/*  15: 29 */     b(paramdt.n() + 0.5D, paramdt.o() + 0.5D, paramdt.p() + 0.5D);
/*  16: 30 */     float f1 = 0.125F;
/*  17: 31 */     float f2 = 0.1875F;
/*  18: 32 */     float f3 = 0.25F;
/*  19: 33 */     a(new brt(this.s - 0.1875D, this.t - 0.25D + 0.125D, this.u - 0.1875D, this.s + 0.1875D, this.t + 0.25D + 0.125D, this.u + 0.1875D));
/*  20:    */   }
/*  21:    */   
/*  22:    */   protected void h()
/*  23:    */   {
/*  24: 38 */     super.h();
/*  25:    */   }
/*  26:    */   
/*  27:    */   public void a(ej paramej) {}
/*  28:    */   
/*  29:    */   public int l()
/*  30:    */   {
/*  31: 48 */     return 9;
/*  32:    */   }
/*  33:    */   
/*  34:    */   public int m()
/*  35:    */   {
/*  36: 53 */     return 9;
/*  37:    */   }
/*  38:    */   
/*  39:    */   public float aR()
/*  40:    */   {
/*  41: 58 */     return -0.0625F;
/*  42:    */   }
/*  43:    */   
/*  44:    */   public boolean a(double paramDouble)
/*  45:    */   {
/*  46: 63 */     return paramDouble < 1024.0D;
/*  47:    */   }
/*  48:    */   
/*  49:    */   public void b(wv paramwv) {}
/*  50:    */   
/*  51:    */   public boolean d(fn paramfn)
/*  52:    */   {
/*  53: 73 */     return false;
/*  54:    */   }
/*  55:    */   
/*  56:    */   public void b(fn paramfn) {}
/*  57:    */   
/*  58:    */   public void a(fn paramfn) {}
/*  59:    */   
/*  60:    */   public boolean e(ahd paramahd)
/*  61:    */   {
/*  62: 86 */     amj localamj = paramahd.bz();
/*  63:    */     
/*  64: 88 */     int i = 0;
/*  65:    */     double d;
/*  66:    */     List localList;
/*  67:    */     Iterator localIterator;
/*  68: 89 */     if ((localamj != null) && (localamj.b() == amk.cn) && 
/*  69: 90 */       (!this.o.D))
/*  70:    */     {
/*  71: 92 */       d = 7.0D;
/*  72: 93 */       localList = this.o.a(xn.class, new brt(this.s - d, this.t - d, this.u - d, this.s + d, this.t + d, this.u + d));
/*  73: 94 */       for (localIterator = localList.iterator(); localIterator.hasNext();)
/*  74:    */       {
/*  75: 94 */         localxn = (xn)localIterator.next();
/*  76: 95 */         if ((localxn.cb()) && (localxn.cc() == paramahd))
/*  77:    */         {
/*  78: 96 */           localxn.a(this, true);
/*  79: 97 */           i = 1;
/*  80:    */         }
/*  81:    */       }
/*  82:    */     }
/*  83:    */     xn localxn;
/*  84:102 */     if ((!this.o.D) && (i == 0))
/*  85:    */     {
/*  86:103 */       J();
/*  87:105 */       if (paramahd.by.d)
/*  88:    */       {
/*  89:107 */         d = 7.0D;
/*  90:108 */         localList = this.o.a(xn.class, new brt(this.s - d, this.t - d, this.u - d, this.s + d, this.t + d, this.u + d));
/*  91:109 */         for (localIterator = localList.iterator(); localIterator.hasNext();)
/*  92:    */         {
/*  93:109 */           localxn = (xn)localIterator.next();
/*  94:110 */           if ((localxn.cb()) && (localxn.cc() == this)) {
/*  95:111 */             localxn.a(true, false);
/*  96:    */           }
/*  97:    */         }
/*  98:    */       }
/*  99:    */     }
/* 100:116 */     return true;
/* 101:    */   }
/* 102:    */   
/* 103:    */   public boolean j()
/* 104:    */   {
/* 105:122 */     return this.o.p(this.a).c() instanceof avv;
/* 106:    */   }
/* 107:    */   
/* 108:    */   public static adl a(aqu paramaqu, dt paramdt)
/* 109:    */   {
/* 110:126 */     adl localadl = new adl(paramaqu, paramdt);
/* 111:127 */     localadl.n = true;
/* 112:128 */     paramaqu.d(localadl);
/* 113:129 */     return localadl;
/* 114:    */   }
/* 115:    */   
/* 116:    */   public static adl b(aqu paramaqu, dt paramdt)
/* 117:    */   {
/* 118:133 */     int i = paramdt.n();
/* 119:134 */     int j = paramdt.o();
/* 120:135 */     int k = paramdt.p();
/* 121:    */     
/* 122:137 */     List localList = paramaqu.a(adl.class, new brt(i - 1.0D, j - 1.0D, k - 1.0D, i + 1.0D, j + 1.0D, k + 1.0D));
/* 123:138 */     for (adl localadl : localList) {
/* 124:139 */       if (localadl.n().equals(paramdt)) {
/* 125:140 */         return localadl;
/* 126:    */       }
/* 127:    */     }
/* 128:143 */     return null;
/* 129:    */   }
/* 130:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     adl
 * JD-Core Version:    0.7.0.1
 */