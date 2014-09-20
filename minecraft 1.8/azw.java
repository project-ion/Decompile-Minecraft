/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import com.google.common.collect.Maps;
/*   3:    */ import java.util.List;
/*   4:    */ import java.util.Map;
/*   5:    */ import java.util.Random;
/*   6:    */ 
/*   7:    */ public class azw
/*   8:    */   extends bbl
/*   9:    */ {
/*  10: 24 */   private static Map b = ;
/*  11:    */   private final boolean M;
/*  12:    */   
/*  13:    */   private boolean a(aqu paramaqu, dt paramdt, boolean paramBoolean)
/*  14:    */   {
/*  15: 39 */     if (!b.containsKey(paramaqu)) {
/*  16: 40 */       b.put(paramaqu, Lists.newArrayList());
/*  17:    */     }
/*  18: 43 */     List localList = (List)b.get(paramaqu);
/*  19: 44 */     if (paramBoolean) {
/*  20: 45 */       localList.add(new azx(paramdt, paramaqu.K()));
/*  21:    */     }
/*  22: 48 */     int i = 0;
/*  23: 49 */     for (int j = 0; j < localList.size(); j++)
/*  24:    */     {
/*  25: 50 */       azx localazx = (azx)localList.get(j);
/*  26: 51 */       if (localazx.a.equals(paramdt))
/*  27:    */       {
/*  28: 52 */         i++;
/*  29: 53 */         if (i >= 8) {
/*  30: 54 */           return true;
/*  31:    */         }
/*  32:    */       }
/*  33:    */     }
/*  34: 58 */     return false;
/*  35:    */   }
/*  36:    */   
/*  37:    */   protected azw(boolean paramBoolean)
/*  38:    */   {
/*  39: 62 */     this.M = paramBoolean;
/*  40: 63 */     a(true);
/*  41: 64 */     a(null);
/*  42:    */   }
/*  43:    */   
/*  44:    */   public int a(aqu paramaqu)
/*  45:    */   {
/*  46: 69 */     return 2;
/*  47:    */   }
/*  48:    */   
/*  49:    */   public void c(aqu paramaqu, dt paramdt, bec parambec)
/*  50:    */   {
/*  51: 74 */     if (this.M) {
/*  52: 75 */       for (ej localej : ej.values()) {
/*  53: 76 */         paramaqu.c(paramdt.a(localej), this);
/*  54:    */       }
/*  55:    */     }
/*  56:    */   }
/*  57:    */   
/*  58:    */   public void b(aqu paramaqu, dt paramdt, bec parambec)
/*  59:    */   {
/*  60: 83 */     if (this.M) {
/*  61: 84 */       for (ej localej : ej.values()) {
/*  62: 85 */         paramaqu.c(paramdt.a(localej), this);
/*  63:    */       }
/*  64:    */     }
/*  65:    */   }
/*  66:    */   
/*  67:    */   public int a(ard paramard, dt paramdt, bec parambec, ej paramej)
/*  68:    */   {
/*  69: 92 */     if ((this.M) && (parambec.b(a) != paramej)) {
/*  70: 93 */       return 15;
/*  71:    */     }
/*  72: 96 */     return 0;
/*  73:    */   }
/*  74:    */   
/*  75:    */   private boolean g(aqu paramaqu, dt paramdt, bec parambec)
/*  76:    */   {
/*  77:100 */     ej localej = ((ej)parambec.b(a)).d();
/*  78:    */     
/*  79:102 */     return paramaqu.b(paramdt.a(localej), localej);
/*  80:    */   }
/*  81:    */   
/*  82:    */   public void a(aqu paramaqu, dt paramdt, bec parambec, Random paramRandom) {}
/*  83:    */   
/*  84:    */   public void b(aqu paramaqu, dt paramdt, bec parambec, Random paramRandom)
/*  85:    */   {
/*  86:111 */     boolean bool = g(paramaqu, paramdt, parambec);
/*  87:    */     
/*  88:    */ 
/*  89:114 */     List localList = (List)b.get(paramaqu);
/*  90:115 */     while ((localList != null) && (!localList.isEmpty()) && (paramaqu.K() - ((azx)localList.get(0)).b > 60L)) {
/*  91:116 */       localList.remove(0);
/*  92:    */     }
/*  93:119 */     if (this.M)
/*  94:    */     {
/*  95:120 */       if (bool)
/*  96:    */       {
/*  97:121 */         paramaqu.a(paramdt, aty.aE.P().a(a, parambec.b(a)), 3);
/*  98:123 */         if (a(paramaqu, paramdt, true))
/*  99:    */         {
/* 100:124 */           paramaqu.a(paramdt.n() + 0.5F, paramdt.o() + 0.5F, paramdt.p() + 0.5F, "random.fizz", 0.5F, 2.6F + (paramaqu.s.nextFloat() - paramaqu.s.nextFloat()) * 0.8F);
/* 101:125 */           for (int i = 0; i < 5; i++)
/* 102:    */           {
/* 103:126 */             double d1 = paramdt.n() + paramRandom.nextDouble() * 0.6D + 0.2D;
/* 104:127 */             double d2 = paramdt.o() + paramRandom.nextDouble() * 0.6D + 0.2D;
/* 105:128 */             double d3 = paramdt.p() + paramRandom.nextDouble() * 0.6D + 0.2D;
/* 106:    */             
/* 107:130 */             paramaqu.a(ew.l, d1, d2, d3, 0.0D, 0.0D, 0.0D, new int[0]);
/* 108:    */           }
/* 109:133 */           paramaqu.a(paramdt, paramaqu.p(paramdt).c(), 160);
/* 110:    */         }
/* 111:    */       }
/* 112:    */     }
/* 113:137 */     else if ((!bool) && 
/* 114:138 */       (!a(paramaqu, paramdt, false))) {
/* 115:139 */       paramaqu.a(paramdt, aty.aF.P().a(a, parambec.b(a)), 3);
/* 116:    */     }
/* 117:    */   }
/* 118:    */   
/* 119:    */   public void a(aqu paramaqu, dt paramdt, bec parambec, atr paramatr)
/* 120:    */   {
/* 121:147 */     if (e(paramaqu, paramdt, parambec)) {
/* 122:148 */       return;
/* 123:    */     }
/* 124:151 */     if (this.M == g(paramaqu, paramdt, parambec)) {
/* 125:152 */       paramaqu.a(paramdt, this, a(paramaqu));
/* 126:    */     }
/* 127:    */   }
/* 128:    */   
/* 129:    */   public int b(ard paramard, dt paramdt, bec parambec, ej paramej)
/* 130:    */   {
/* 131:158 */     if (paramej == ej.a) {
/* 132:159 */       return a(paramard, paramdt, parambec, paramej);
/* 133:    */     }
/* 134:161 */     return 0;
/* 135:    */   }
/* 136:    */   
/* 137:    */   public alq a(bec parambec, Random paramRandom, int paramInt)
/* 138:    */   {
/* 139:167 */     return alq.a(aty.aF);
/* 140:    */   }
/* 141:    */   
/* 142:    */   public boolean g()
/* 143:    */   {
/* 144:172 */     return true;
/* 145:    */   }
/* 146:    */   
/* 147:    */   public void c(aqu paramaqu, dt paramdt, bec parambec, Random paramRandom)
/* 148:    */   {
/* 149:177 */     if (!this.M) {
/* 150:178 */       return;
/* 151:    */     }
/* 152:180 */     double d1 = paramdt.n() + 0.5F + (paramRandom.nextFloat() - 0.5F) * 0.2D;
/* 153:181 */     double d2 = paramdt.o() + 0.7F + (paramRandom.nextFloat() - 0.5F) * 0.2D;
/* 154:182 */     double d3 = paramdt.p() + 0.5F + (paramRandom.nextFloat() - 0.5F) * 0.2D;
/* 155:    */     
/* 156:184 */     ej localej1 = (ej)parambec.b(a);
/* 157:185 */     if (localej1.k().c())
/* 158:    */     {
/* 159:186 */       ej localej2 = localej1.d();
/* 160:    */       
/* 161:188 */       double d4 = 0.2700000107288361D;
/* 162:    */       
/* 163:190 */       d1 += 0.2700000107288361D * localej2.g();
/* 164:191 */       d2 += 0.219999998807907D;
/* 165:192 */       d3 += 0.2700000107288361D * localej2.i();
/* 166:    */     }
/* 167:194 */     paramaqu.a(ew.E, d1, d2, d3, 0.0D, 0.0D, 0.0D, new int[0]);
/* 168:    */   }
/* 169:    */   
/* 170:    */   public alq b(aqu paramaqu, dt paramdt)
/* 171:    */   {
/* 172:199 */     return alq.a(aty.aF);
/* 173:    */   }
/* 174:    */   
/* 175:    */   public boolean b(atr paramatr)
/* 176:    */   {
/* 177:204 */     return (paramatr == aty.aE) || (paramatr == aty.aF);
/* 178:    */   }
/* 179:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     azw
 * JD-Core Version:    0.7.0.1
 */