/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ public class bhy
/*   4:    */   extends bhp
/*   5:    */ {
/*   6:    */   private atr a;
/*   7:    */   
/*   8:    */   public bhy(atr paramatr)
/*   9:    */   {
/*  10: 17 */     this.a = paramatr;
/*  11:    */   }
/*  12:    */   
/*  13:    */   public boolean b(aqu paramaqu, Random paramRandom, dt paramdt)
/*  14:    */   {
/*  15: 22 */     paramdt = paramdt.a(-8, 0, -8);
/*  16: 23 */     while ((paramdt.o() > 5) && (paramaqu.d(paramdt))) {
/*  17: 24 */       paramdt = paramdt.b();
/*  18:    */     }
/*  19: 26 */     if (paramdt.o() <= 4) {
/*  20: 27 */       return false;
/*  21:    */     }
/*  22: 30 */     paramdt = paramdt.c(4);
/*  23:    */     
/*  24: 32 */     boolean[] arrayOfBoolean = new boolean[2048];
/*  25:    */     
/*  26: 34 */     int i = paramRandom.nextInt(4) + 4;
/*  27: 35 */     for (int j = 0; j < i; j++)
/*  28:    */     {
/*  29: 36 */       double d1 = paramRandom.nextDouble() * 6.0D + 3.0D;
/*  30: 37 */       double d2 = paramRandom.nextDouble() * 4.0D + 2.0D;
/*  31: 38 */       double d3 = paramRandom.nextDouble() * 6.0D + 3.0D;
/*  32:    */       
/*  33: 40 */       double d4 = paramRandom.nextDouble() * (16.0D - d1 - 2.0D) + 1.0D + d1 / 2.0D;
/*  34: 41 */       double d5 = paramRandom.nextDouble() * (8.0D - d2 - 4.0D) + 2.0D + d2 / 2.0D;
/*  35: 42 */       double d6 = paramRandom.nextDouble() * (16.0D - d3 - 2.0D) + 1.0D + d3 / 2.0D;
/*  36: 44 */       for (int i2 = 1; i2 < 15; i2++) {
/*  37: 45 */         for (int i3 = 1; i3 < 15; i3++) {
/*  38: 46 */           for (int i4 = 1; i4 < 7; i4++)
/*  39:    */           {
/*  40: 47 */             double d7 = (i2 - d4) / (d1 / 2.0D);
/*  41: 48 */             double d8 = (i4 - d5) / (d2 / 2.0D);
/*  42: 49 */             double d9 = (i3 - d6) / (d3 / 2.0D);
/*  43: 50 */             double d10 = d7 * d7 + d8 * d8 + d9 * d9;
/*  44: 51 */             if (d10 < 1.0D) {
/*  45: 52 */               arrayOfBoolean[((i2 * 16 + i3) * 8 + i4)] = true;
/*  46:    */             }
/*  47:    */           }
/*  48:    */         }
/*  49:    */       }
/*  50:    */     }
/*  51:    */     int k;
/*  52:    */     int m;
/*  53:    */     Object localObject;
/*  54: 59 */     for (j = 0; j < 16; j++) {
/*  55: 60 */       for (k = 0; k < 16; k++) {
/*  56: 61 */         for (m = 0; m < 8; m++)
/*  57:    */         {
/*  58: 62 */           int n = (arrayOfBoolean[((j * 16 + k) * 8 + m)] == 0) && (((j < 15) && (arrayOfBoolean[(((j + 1) * 16 + k) * 8 + m)] != 0)) || ((j > 0) && (arrayOfBoolean[(((j - 1) * 16 + k) * 8 + m)] != 0)) || ((k < 15) && (arrayOfBoolean[((j * 16 + (k + 1)) * 8 + m)] != 0)) || ((k > 0) && (arrayOfBoolean[((j * 16 + (k - 1)) * 8 + m)] != 0)) || ((m < 7) && (arrayOfBoolean[((j * 16 + k) * 8 + (m + 1))] != 0)) || ((m > 0) && (arrayOfBoolean[((j * 16 + k) * 8 + (m - 1))] != 0))) ? 1 : 0;
/*  59: 71 */           if (n != 0)
/*  60:    */           {
/*  61: 72 */             localObject = paramaqu.p(paramdt.a(j, m, k)).c().r();
/*  62: 73 */             if ((m >= 4) && (((bof)localObject).d())) {
/*  63: 74 */               return false;
/*  64:    */             }
/*  65: 76 */             if ((m < 4) && (!((bof)localObject).a()) && (paramaqu.p(paramdt.a(j, m, k)).c() != this.a)) {
/*  66: 77 */               return false;
/*  67:    */             }
/*  68:    */           }
/*  69:    */         }
/*  70:    */       }
/*  71:    */     }
/*  72: 84 */     for (j = 0; j < 16; j++) {
/*  73: 85 */       for (k = 0; k < 16; k++) {
/*  74: 86 */         for (m = 0; m < 8; m++) {
/*  75: 87 */           if (arrayOfBoolean[((j * 16 + k) * 8 + m)] != 0) {
/*  76: 88 */             paramaqu.a(paramdt.a(j, m, k), m >= 4 ? aty.a.P() : this.a.P(), 2);
/*  77:    */           }
/*  78:    */         }
/*  79:    */       }
/*  80:    */     }
/*  81: 94 */     for (j = 0; j < 16; j++) {
/*  82: 95 */       for (k = 0; k < 16; k++) {
/*  83: 96 */         for (m = 4; m < 8; m++) {
/*  84: 97 */           if (arrayOfBoolean[((j * 16 + k) * 8 + m)] != 0)
/*  85:    */           {
/*  86: 98 */             dt localdt = paramdt.a(j, m - 1, k);
/*  87:100 */             if ((paramaqu.p(localdt).c() == aty.d) && (paramaqu.b(arf.a, paramdt.a(j, m, k)) > 0))
/*  88:    */             {
/*  89:101 */               localObject = paramaqu.b(localdt);
/*  90:102 */               if (((arm)localObject).ak.c() == aty.bw) {
/*  91:103 */                 paramaqu.a(localdt, aty.bw.P(), 2);
/*  92:    */               } else {
/*  93:105 */                 paramaqu.a(localdt, aty.c.P(), 2);
/*  94:    */               }
/*  95:    */             }
/*  96:    */           }
/*  97:    */         }
/*  98:    */       }
/*  99:    */     }
/* 100:113 */     if (this.a.r() == bof.i) {
/* 101:114 */       for (j = 0; j < 16; j++) {
/* 102:115 */         for (k = 0; k < 16; k++) {
/* 103:116 */           for (m = 0; m < 8; m++)
/* 104:    */           {
/* 105:117 */             int i1 = (arrayOfBoolean[((j * 16 + k) * 8 + m)] == 0) && (((j < 15) && (arrayOfBoolean[(((j + 1) * 16 + k) * 8 + m)] != 0)) || ((j > 0) && (arrayOfBoolean[(((j - 1) * 16 + k) * 8 + m)] != 0)) || ((k < 15) && (arrayOfBoolean[((j * 16 + (k + 1)) * 8 + m)] != 0)) || ((k > 0) && (arrayOfBoolean[((j * 16 + (k - 1)) * 8 + m)] != 0)) || ((m < 7) && (arrayOfBoolean[((j * 16 + k) * 8 + (m + 1))] != 0)) || ((m > 0) && (arrayOfBoolean[((j * 16 + k) * 8 + (m - 1))] != 0))) ? 1 : 0;
/* 106:126 */             if ((i1 != 0) && 
/* 107:127 */               ((m < 4) || (paramRandom.nextInt(2) != 0)) && (paramaqu.p(paramdt.a(j, m, k)).c().r().a())) {
/* 108:128 */               paramaqu.a(paramdt.a(j, m, k), aty.b.P(), 2);
/* 109:    */             }
/* 110:    */           }
/* 111:    */         }
/* 112:    */       }
/* 113:    */     }
/* 114:136 */     if (this.a.r() == bof.h) {
/* 115:137 */       for (j = 0; j < 16; j++) {
/* 116:138 */         for (k = 0; k < 16; k++)
/* 117:    */         {
/* 118:139 */           m = 4;
/* 119:140 */           if (paramaqu.v(paramdt.a(j, m, k))) {
/* 120:141 */             paramaqu.a(paramdt.a(j, m, k), aty.aI.P(), 2);
/* 121:    */           }
/* 122:    */         }
/* 123:    */       }
/* 124:    */     }
/* 125:147 */     return true;
/* 126:    */   }
/* 127:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     bhy
 * JD-Core Version:    0.7.0.1
 */