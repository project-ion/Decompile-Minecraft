/*   1:    */ import com.mojang.authlib.GameProfile;
/*   2:    */ import java.util.List;
/*   3:    */ 
/*   4:    */ public class anh
/*   5:    */   extends alq
/*   6:    */ {
/*   7: 23 */   private static final String[] a = { "skeleton", "wither", "zombie", "char", "creeper" };
/*   8:    */   
/*   9:    */   public anh()
/*  10:    */   {
/*  11: 28 */     a(akf.c);
/*  12: 29 */     d(0);
/*  13: 30 */     a(true);
/*  14:    */   }
/*  15:    */   
/*  16:    */   public boolean a(amj paramamj, ahd paramahd, aqu paramaqu, dt paramdt, ej paramej, float paramFloat1, float paramFloat2, float paramFloat3)
/*  17:    */   {
/*  18: 35 */     if (paramej == ej.a) {
/*  19: 36 */       return false;
/*  20:    */     }
/*  21: 39 */     bec localbec = paramaqu.p(paramdt);
/*  22: 40 */     atr localatr = localbec.c();
/*  23: 41 */     boolean bool = localatr.f(paramaqu, paramdt);
/*  24: 43 */     if (!bool)
/*  25:    */     {
/*  26: 44 */       if (!paramaqu.p(paramdt).c().r().a()) {
/*  27: 45 */         return false;
/*  28:    */       }
/*  29: 47 */       paramdt = paramdt.a(paramej);
/*  30:    */     }
/*  31: 50 */     if (!paramahd.a(paramdt, paramej, paramamj)) {
/*  32: 51 */       return false;
/*  33:    */     }
/*  34: 53 */     if (!aty.ce.c(paramaqu, paramdt)) {
/*  35: 54 */       return false;
/*  36:    */     }
/*  37: 57 */     if (!paramaqu.D)
/*  38:    */     {
/*  39: 58 */       paramaqu.a(paramdt, aty.ce.P().a(baj.a, paramej), 3);
/*  40:    */       
/*  41: 60 */       int i = 0;
/*  42: 61 */       if (paramej == ej.b) {
/*  43: 62 */         i = uv.c(paramahd.y * 16.0F / 360.0F + 0.5D) & 0xF;
/*  44:    */       }
/*  45: 65 */       bcm localbcm = paramaqu.s(paramdt);
/*  46: 66 */       if ((localbcm instanceof bdm))
/*  47:    */       {
/*  48: 67 */         bdm localbdm = (bdm)localbcm;
/*  49: 68 */         if (paramamj.i() == 3)
/*  50:    */         {
/*  51: 69 */           GameProfile localGameProfile = null;
/*  52: 70 */           if (paramamj.n())
/*  53:    */           {
/*  54: 71 */             fn localfn = paramamj.o();
/*  55: 73 */             if (localfn.b("SkullOwner", 10)) {
/*  56: 74 */               localGameProfile = ga.a(localfn.m("SkullOwner"));
/*  57: 75 */             } else if ((localfn.b("SkullOwner", 8)) && (localfn.j("SkullOwner").length() > 0)) {
/*  58: 76 */               localGameProfile = new GameProfile(null, localfn.j("SkullOwner"));
/*  59:    */             }
/*  60:    */           }
/*  61: 80 */           localbdm.a(localGameProfile);
/*  62:    */         }
/*  63:    */         else
/*  64:    */         {
/*  65: 82 */           localbdm.a(paramamj.i());
/*  66:    */         }
/*  67: 84 */         localbdm.b(i);
/*  68: 85 */         aty.ce.a(paramaqu, paramdt, localbdm);
/*  69:    */       }
/*  70: 88 */       paramamj.b -= 1;
/*  71:    */     }
/*  72: 91 */     return true;
/*  73:    */   }
/*  74:    */   
/*  75:    */   public void a(alq paramalq, akf paramakf, List paramList)
/*  76:    */   {
/*  77: 96 */     for (int i = 0; i < a.length; i++) {
/*  78: 97 */       paramList.add(new amj(paramalq, 1, i));
/*  79:    */     }
/*  80:    */   }
/*  81:    */   
/*  82:    */   public int a(int paramInt)
/*  83:    */   {
/*  84:103 */     return paramInt;
/*  85:    */   }
/*  86:    */   
/*  87:    */   public String e_(amj paramamj)
/*  88:    */   {
/*  89:108 */     int i = paramamj.i();
/*  90:109 */     if ((i < 0) || (i >= a.length)) {
/*  91:110 */       i = 0;
/*  92:    */     }
/*  93:112 */     return super.a() + "." + a[i];
/*  94:    */   }
/*  95:    */   
/*  96:    */   public String a(amj paramamj)
/*  97:    */   {
/*  98:117 */     if ((paramamj.i() == 3) && (paramamj.n()))
/*  99:    */     {
/* 100:118 */       if (paramamj.o().b("SkullOwner", 8)) {
/* 101:119 */         return fi.a("item.skull.player.name", new Object[] { paramamj.o().j("SkullOwner") });
/* 102:    */       }
/* 103:120 */       if (paramamj.o().b("SkullOwner", 10))
/* 104:    */       {
/* 105:121 */         fn localfn = paramamj.o().m("SkullOwner");
/* 106:122 */         if (localfn.b("Name", 8)) {
/* 107:123 */           return fi.a("item.skull.player.name", new Object[] { localfn.j("Name") });
/* 108:    */         }
/* 109:    */       }
/* 110:    */     }
/* 111:127 */     return super.a(paramamj);
/* 112:    */   }
/* 113:    */   
/* 114:    */   public boolean a(fn paramfn)
/* 115:    */   {
/* 116:132 */     super.a(paramfn);
/* 117:133 */     if ((paramfn.b("SkullOwner", 8)) && (paramfn.j("SkullOwner").length() > 0))
/* 118:    */     {
/* 119:134 */       GameProfile localGameProfile = new GameProfile(null, paramfn.j("SkullOwner"));
/* 120:135 */       localGameProfile = bdm.b(localGameProfile);
/* 121:136 */       paramfn.a("SkullOwner", ga.a(new fn(), localGameProfile));
/* 122:137 */       return true;
/* 123:    */     }
/* 124:139 */     return false;
/* 125:    */   }
/* 126:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     anh
 * JD-Core Version:    0.7.0.1
 */