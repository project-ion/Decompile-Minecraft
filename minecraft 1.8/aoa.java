/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import java.util.ArrayList;
/*   3:    */ import java.util.List;
/*   4:    */ 
/*   5:    */ public class aoa
/*   6:    */   implements aoo
/*   7:    */ {
/*   8:    */   public boolean a(ain paramain, aqu paramaqu)
/*   9:    */   {
/*  10: 18 */     Object localObject = null;
/*  11: 19 */     ArrayList localArrayList = Lists.newArrayList();
/*  12: 21 */     for (int i = 0; i < paramain.n_(); i++)
/*  13:    */     {
/*  14: 22 */       amj localamj = paramain.a(i);
/*  15: 23 */       if (localamj != null) {
/*  16: 27 */         if ((localamj.b() instanceof ajn))
/*  17:    */         {
/*  18: 28 */           ajn localajn = (ajn)localamj.b();
/*  19: 30 */           if ((localajn.w_() == ajp.a) && (localObject == null)) {
/*  20: 31 */             localObject = localamj;
/*  21:    */           } else {
/*  22: 33 */             return false;
/*  23:    */           }
/*  24:    */         }
/*  25: 35 */         else if (localamj.b() == amk.aW)
/*  26:    */         {
/*  27: 36 */           localArrayList.add(localamj);
/*  28:    */         }
/*  29:    */         else
/*  30:    */         {
/*  31: 38 */           return false;
/*  32:    */         }
/*  33:    */       }
/*  34:    */     }
/*  35: 42 */     return (localObject != null) && (!localArrayList.isEmpty());
/*  36:    */   }
/*  37:    */   
/*  38:    */   public amj a(ain paramain)
/*  39:    */   {
/*  40: 48 */     amj localamj1 = null;
/*  41: 49 */     int[] arrayOfInt = new int[3];
/*  42: 50 */     int i = 0;
/*  43: 51 */     int j = 0;
/*  44: 52 */     ajn localajn = null;
/*  45: 54 */     for (int k = 0; k < paramain.n_(); k++)
/*  46:    */     {
/*  47: 55 */       amj localamj2 = paramain.a(k);
/*  48: 56 */       if (localamj2 != null) {
/*  49: 60 */         if ((localamj2.b() instanceof ajn))
/*  50:    */         {
/*  51: 61 */           localajn = (ajn)localamj2.b();
/*  52: 63 */           if ((localajn.w_() == ajp.a) && (localamj1 == null))
/*  53:    */           {
/*  54: 64 */             localamj1 = localamj2.k();
/*  55: 65 */             localamj1.b = 1;
/*  56: 67 */             if (localajn.d_(localamj2))
/*  57:    */             {
/*  58: 68 */               int n = localajn.b(localamj1);
/*  59: 69 */               float f1 = (n >> 16 & 0xFF) / 255.0F;
/*  60: 70 */               float f3 = (n >> 8 & 0xFF) / 255.0F;
/*  61: 71 */               float f5 = (n & 0xFF) / 255.0F;
/*  62:    */               
/*  63: 73 */               i = (int)(i + Math.max(f1, Math.max(f3, f5)) * 255.0F); int 
/*  64:    */               
/*  65: 75 */                 tmp174_173 = 0; int[] tmp174_172 = arrayOfInt;tmp174_172[tmp174_173] = ((int)(tmp174_172[tmp174_173] + f1 * 255.0F)); int 
/*  66: 76 */                 tmp187_186 = 1; int[] tmp187_185 = arrayOfInt;tmp187_185[tmp187_186] = ((int)(tmp187_185[tmp187_186] + f3 * 255.0F)); int 
/*  67: 77 */                 tmp200_199 = 2; int[] tmp200_198 = arrayOfInt;tmp200_198[tmp200_199] = ((int)(tmp200_198[tmp200_199] + f5 * 255.0F));
/*  68: 78 */               j++;
/*  69:    */             }
/*  70:    */           }
/*  71:    */           else
/*  72:    */           {
/*  73: 81 */             return null;
/*  74:    */           }
/*  75:    */         }
/*  76: 83 */         else if (localamj2.b() == amk.aW)
/*  77:    */         {
/*  78: 84 */           float[] arrayOfFloat = acl.a(akv.a(localamj2.i()));
/*  79: 85 */           int i2 = (int)(arrayOfFloat[0] * 255.0F);
/*  80: 86 */           int i3 = (int)(arrayOfFloat[1] * 255.0F);
/*  81: 87 */           i4 = (int)(arrayOfFloat[2] * 255.0F);
/*  82:    */           
/*  83: 89 */           i += Math.max(i2, Math.max(i3, i4));
/*  84:    */           
/*  85: 91 */           arrayOfInt[0] += i2;
/*  86: 92 */           arrayOfInt[1] += i3;
/*  87: 93 */           arrayOfInt[2] += i4;
/*  88: 94 */           j++;
/*  89:    */         }
/*  90:    */         else
/*  91:    */         {
/*  92: 96 */           return null;
/*  93:    */         }
/*  94:    */       }
/*  95:    */     }
/*  96:100 */     if (localajn == null) {
/*  97:101 */       return null;
/*  98:    */     }
/*  99:104 */     k = arrayOfInt[0] / j;
/* 100:105 */     int m = arrayOfInt[1] / j;
/* 101:106 */     int i1 = arrayOfInt[2] / j;
/* 102:    */     
/* 103:108 */     float f2 = i / j;
/* 104:109 */     float f4 = Math.max(k, Math.max(m, i1));
/* 105:    */     
/* 106:111 */     k = (int)(k * f2 / f4);
/* 107:112 */     m = (int)(m * f2 / f4);
/* 108:113 */     i1 = (int)(i1 * f2 / f4);
/* 109:    */     
/* 110:115 */     int i4 = k;
/* 111:116 */     i4 = (i4 << 8) + m;
/* 112:117 */     i4 = (i4 << 8) + i1;
/* 113:    */     
/* 114:119 */     localajn.b(localamj1, i4);
/* 115:120 */     return localamj1;
/* 116:    */   }
/* 117:    */   
/* 118:    */   public int a()
/* 119:    */   {
/* 120:125 */     return 10;
/* 121:    */   }
/* 122:    */   
/* 123:    */   public amj b()
/* 124:    */   {
/* 125:131 */     return null;
/* 126:    */   }
/* 127:    */   
/* 128:    */   public amj[] b(ain paramain)
/* 129:    */   {
/* 130:136 */     amj[] arrayOfamj = new amj[paramain.n_()];
/* 131:138 */     for (int i = 0; i < arrayOfamj.length; i++)
/* 132:    */     {
/* 133:139 */       amj localamj = paramain.a(i);
/* 134:140 */       if ((localamj != null) && (localamj.b().r())) {
/* 135:141 */         arrayOfamj[i] = new amj(localamj.b().q());
/* 136:    */       }
/* 137:    */     }
/* 138:145 */     return arrayOfamj;
/* 139:    */   }
/* 140:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     aoa
 * JD-Core Version:    0.7.0.1
 */