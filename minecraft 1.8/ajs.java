/*   1:    */ import java.util.List;
/*   2:    */ 
/*   3:    */ public class ajs
/*   4:    */   extends aju
/*   5:    */ {
/*   6:    */   public ajs()
/*   7:    */   {
/*   8: 27 */     super(aty.cK);
/*   9: 28 */     this.h = 16;
/*  10: 29 */     a(akf.c);
/*  11: 30 */     a(true);
/*  12: 31 */     d(0);
/*  13:    */   }
/*  14:    */   
/*  15:    */   public boolean a(amj paramamj, ahd paramahd, aqu paramaqu, dt paramdt, ej paramej, float paramFloat1, float paramFloat2, float paramFloat3)
/*  16:    */   {
/*  17: 36 */     if (paramej == ej.a) {
/*  18: 37 */       return false;
/*  19:    */     }
/*  20: 39 */     if (!paramaqu.p(paramdt).c().r().a()) {
/*  21: 40 */       return false;
/*  22:    */     }
/*  23: 43 */     paramdt = paramdt.a(paramej);
/*  24: 45 */     if (!paramahd.a(paramdt, paramej, paramamj)) {
/*  25: 46 */       return false;
/*  26:    */     }
/*  27: 48 */     if (!aty.cK.c(paramaqu, paramdt)) {
/*  28: 49 */       return false;
/*  29:    */     }
/*  30: 52 */     if (paramaqu.D) {
/*  31: 53 */       return true;
/*  32:    */     }
/*  33: 56 */     if (paramej == ej.b)
/*  34:    */     {
/*  35: 57 */       int i = uv.c((paramahd.y + 180.0F) * 16.0F / 360.0F + 0.5D) & 0xF;
/*  36: 58 */       paramaqu.a(paramdt, aty.cK.P().a(baw.a, Integer.valueOf(i)), 3);
/*  37:    */     }
/*  38:    */     else
/*  39:    */     {
/*  40: 60 */       paramaqu.a(paramdt, aty.cL.P().a(bbz.a, paramej), 3);
/*  41:    */     }
/*  42: 63 */     paramamj.b -= 1;
/*  43: 64 */     bcm localbcm = paramaqu.s(paramdt);
/*  44: 65 */     if ((localbcm instanceof bci)) {
/*  45: 66 */       ((bci)localbcm).a(paramamj);
/*  46:    */     }
/*  47: 68 */     return true;
/*  48:    */   }
/*  49:    */   
/*  50:    */   public String a(amj paramamj)
/*  51:    */   {
/*  52: 73 */     String str = "item.banner.";
/*  53:    */     
/*  54: 75 */     akv localakv = h(paramamj);
/*  55: 76 */     str = str + localakv.d() + ".name";
/*  56: 77 */     return fi.a(str);
/*  57:    */   }
/*  58:    */   
/*  59:    */   public void a(amj paramamj, ahd paramahd, List paramList, boolean paramBoolean)
/*  60:    */   {
/*  61: 82 */     fn localfn1 = paramamj.a("BlockEntityTag", false);
/*  62: 83 */     if ((localfn1 == null) || (!localfn1.c("Patterns"))) {
/*  63: 84 */       return;
/*  64:    */     }
/*  65: 87 */     fv localfv = localfn1.c("Patterns", 10);
/*  66: 88 */     for (int i = 0; (i < localfv.c()) && (i < 6); i++)
/*  67:    */     {
/*  68: 89 */       fn localfn2 = localfv.b(i);
/*  69: 90 */       akv localakv = akv.a(localfn2.f("Color"));
/*  70: 91 */       bcj localbcj = bcj.a(localfn2.j("Pattern"));
/*  71: 93 */       if (localbcj != null) {
/*  72: 94 */         paramList.add(fi.a("item.banner." + localbcj.a() + "." + localakv.d()));
/*  73:    */       }
/*  74:    */     }
/*  75:    */   }
/*  76:    */   
/*  77:    */   public int a(amj paramamj, int paramInt)
/*  78:    */   {
/*  79:101 */     if (paramInt == 0) {
/*  80:102 */       return 16777215;
/*  81:    */     }
/*  82:104 */     akv localakv = h(paramamj);
/*  83:105 */     return localakv.e().L;
/*  84:    */   }
/*  85:    */   
/*  86:    */   public void a(alq paramalq, akf paramakf, List paramList)
/*  87:    */   {
/*  88:110 */     for (akv localakv : ) {
/*  89:111 */       paramList.add(new amj(paramalq, 1, localakv.b()));
/*  90:    */     }
/*  91:    */   }
/*  92:    */   
/*  93:    */   public akf c()
/*  94:    */   {
/*  95:118 */     return akf.c;
/*  96:    */   }
/*  97:    */   
/*  98:    */   private akv h(amj paramamj)
/*  99:    */   {
/* 100:122 */     fn localfn = paramamj.a("BlockEntityTag", false);
/* 101:123 */     akv localakv = null;
/* 102:124 */     if ((localfn != null) && (localfn.c("Base"))) {
/* 103:125 */       localakv = akv.a(localfn.f("Base"));
/* 104:    */     } else {
/* 105:127 */       localakv = akv.a(paramamj.i());
/* 106:    */     }
/* 107:129 */     return localakv;
/* 108:    */   }
/* 109:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     ajs
 * JD-Core Version:    0.7.0.1
 */