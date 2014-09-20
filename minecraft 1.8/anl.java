/*   1:    */ import java.util.List;
/*   2:    */ import java.util.Map;
/*   3:    */ import java.util.Random;
/*   4:    */ 
/*   5:    */ public class anl
/*   6:    */   extends alq
/*   7:    */ {
/*   8:    */   public anl()
/*   9:    */   {
/*  10: 30 */     a(true);
/*  11: 31 */     a(akf.f);
/*  12:    */   }
/*  13:    */   
/*  14:    */   public String a(amj paramamj)
/*  15:    */   {
/*  16: 36 */     String str1 = ("" + fi.a(new StringBuilder().append(a()).append(".name").toString())).trim();
/*  17:    */     
/*  18: 38 */     String str2 = xb.b(paramamj.i());
/*  19: 39 */     if (str2 != null) {
/*  20: 40 */       str1 = str1 + " " + fi.a(new StringBuilder().append("entity.").append(str2).append(".name").toString());
/*  21:    */     }
/*  22: 43 */     return str1;
/*  23:    */   }
/*  24:    */   
/*  25:    */   public int a(amj paramamj, int paramInt)
/*  26:    */   {
/*  27: 48 */     xc localxc = (xc)xb.a.get(Integer.valueOf(paramamj.i()));
/*  28: 49 */     if (localxc != null)
/*  29:    */     {
/*  30: 50 */       if (paramInt == 0) {
/*  31: 51 */         return localxc.b;
/*  32:    */       }
/*  33: 53 */       return localxc.c;
/*  34:    */     }
/*  35: 55 */     return 16777215;
/*  36:    */   }
/*  37:    */   
/*  38:    */   public boolean a(amj paramamj, ahd paramahd, aqu paramaqu, dt paramdt, ej paramej, float paramFloat1, float paramFloat2, float paramFloat3)
/*  39:    */   {
/*  40: 60 */     if (paramaqu.D) {
/*  41: 61 */       return true;
/*  42:    */     }
/*  43: 63 */     if (!paramahd.a(paramdt.a(paramej), paramej, paramamj)) {
/*  44: 64 */       return false;
/*  45:    */     }
/*  46: 67 */     bec localbec = paramaqu.p(paramdt);
/*  47: 68 */     if (localbec.c() == aty.ac)
/*  48:    */     {
/*  49: 69 */       bcm localbcm = paramaqu.s(paramdt);
/*  50: 70 */       if ((localbcm instanceof bdg))
/*  51:    */       {
/*  52: 71 */         aqi localaqi = ((bdg)localbcm).b();
/*  53: 72 */         localaqi.a(xb.b(paramamj.i()));
/*  54: 73 */         localbcm.o_();
/*  55: 74 */         paramaqu.h(paramdt);
/*  56: 75 */         if (!paramahd.by.d) {
/*  57: 76 */           paramamj.b -= 1;
/*  58:    */         }
/*  59: 78 */         return true;
/*  60:    */       }
/*  61:    */     }
/*  62: 82 */     paramdt = paramdt.a(paramej);
/*  63:    */     
/*  64: 84 */     double d = 0.0D;
/*  65: 85 */     if ((paramej == ej.b) && ((localbec instanceof avv))) {
/*  66: 87 */       d = 0.5D;
/*  67:    */     }
/*  68: 90 */     wv localwv = a(paramaqu, paramamj.i(), paramdt.n() + 0.5D, paramdt.o() + d, paramdt.p() + 0.5D);
/*  69: 91 */     if (localwv != null)
/*  70:    */     {
/*  71: 92 */       if (((localwv instanceof xm)) && (paramamj.s())) {
/*  72: 93 */         localwv.a(paramamj.q());
/*  73:    */       }
/*  74: 95 */       if (!paramahd.by.d) {
/*  75: 96 */         paramamj.b -= 1;
/*  76:    */       }
/*  77:    */     }
/*  78:100 */     return true;
/*  79:    */   }
/*  80:    */   
/*  81:    */   public amj a(amj paramamj, aqu paramaqu, ahd paramahd)
/*  82:    */   {
/*  83:105 */     if (paramaqu.D) {
/*  84:106 */       return paramamj;
/*  85:    */     }
/*  86:109 */     bru localbru = a(paramaqu, paramahd, true);
/*  87:110 */     if (localbru == null) {
/*  88:111 */       return paramamj;
/*  89:    */     }
/*  90:114 */     if (localbru.a == brv.b)
/*  91:    */     {
/*  92:115 */       dt localdt = localbru.a();
/*  93:117 */       if (!paramaqu.a(paramahd, localdt)) {
/*  94:118 */         return paramamj;
/*  95:    */       }
/*  96:120 */       if (!paramahd.a(localdt, localbru.b, paramamj)) {
/*  97:121 */         return paramamj;
/*  98:    */       }
/*  99:124 */       if ((paramaqu.p(localdt).c() instanceof axl))
/* 100:    */       {
/* 101:125 */         wv localwv = a(paramaqu, paramamj.i(), localdt.n() + 0.5D, localdt.o() + 0.5D, localdt.p() + 0.5D);
/* 102:126 */         if (localwv != null)
/* 103:    */         {
/* 104:127 */           if (((localwv instanceof xm)) && (paramamj.s())) {
/* 105:128 */             ((xn)localwv).a(paramamj.q());
/* 106:    */           }
/* 107:130 */           if (!paramahd.by.d) {
/* 108:131 */             paramamj.b -= 1;
/* 109:    */           }
/* 110:133 */           paramahd.b(ty.J[alq.b(this)]);
/* 111:    */         }
/* 112:    */       }
/* 113:    */     }
/* 114:137 */     return paramamj;
/* 115:    */   }
/* 116:    */   
/* 117:    */   public static wv a(aqu paramaqu, int paramInt, double paramDouble1, double paramDouble2, double paramDouble3)
/* 118:    */   {
/* 119:141 */     if (!xb.a.containsKey(Integer.valueOf(paramInt))) {
/* 120:142 */       return null;
/* 121:    */     }
/* 122:145 */     wv localwv = null;
/* 123:147 */     for (int i = 0; i < 1; i++)
/* 124:    */     {
/* 125:148 */       localwv = xb.a(paramInt, paramaqu);
/* 126:150 */       if ((localwv instanceof xm))
/* 127:    */       {
/* 128:151 */         xn localxn = (xn)localwv;
/* 129:152 */         localwv.b(paramDouble1, paramDouble2, paramDouble3, uv.g(paramaqu.s.nextFloat() * 360.0F), 0.0F);
/* 130:153 */         localxn.aI = localxn.y;
/* 131:154 */         localxn.aG = localxn.y;
/* 132:    */         
/* 133:156 */         localxn.a(paramaqu.E(new dt(localxn)), null);
/* 134:157 */         paramaqu.d(localwv);
/* 135:158 */         localxn.x();
/* 136:    */       }
/* 137:    */     }
/* 138:162 */     return localwv;
/* 139:    */   }
/* 140:    */   
/* 141:    */   public void a(alq paramalq, akf paramakf, List paramList)
/* 142:    */   {
/* 143:167 */     for (xc localxc : xb.a.values()) {
/* 144:168 */       paramList.add(new amj(paramalq, 1, localxc.a));
/* 145:    */     }
/* 146:    */   }
/* 147:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     anl
 * JD-Core Version:    0.7.0.1
 */