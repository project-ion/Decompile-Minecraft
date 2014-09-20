/*   1:    */ import java.util.List;
/*   2:    */ 
/*   3:    */ public class anr
/*   4:    */   extends alq
/*   5:    */ {
/*   6:    */   public anr()
/*   7:    */   {
/*   8: 36 */     c(1);
/*   9:    */   }
/*  10:    */   
/*  11:    */   public static boolean b(fn paramfn)
/*  12:    */   {
/*  13: 40 */     if (!anq.b(paramfn)) {
/*  14: 41 */       return false;
/*  15:    */     }
/*  16: 44 */     if (!paramfn.b("title", 8)) {
/*  17: 45 */       return false;
/*  18:    */     }
/*  19: 47 */     String str = paramfn.j("title");
/*  20: 48 */     if ((str == null) || (str.length() > 32)) {
/*  21: 49 */       return false;
/*  22:    */     }
/*  23: 52 */     if (!paramfn.b("author", 8)) {
/*  24: 53 */       return false;
/*  25:    */     }
/*  26: 56 */     return true;
/*  27:    */   }
/*  28:    */   
/*  29:    */   public static int h(amj paramamj)
/*  30:    */   {
/*  31: 60 */     return paramamj.o().f("generation");
/*  32:    */   }
/*  33:    */   
/*  34:    */   public String a(amj paramamj)
/*  35:    */   {
/*  36: 65 */     if (paramamj.n())
/*  37:    */     {
/*  38: 66 */       fn localfn = paramamj.o();
/*  39:    */       
/*  40: 68 */       String str = localfn.j("title");
/*  41: 69 */       if (!vb.b(str)) {
/*  42: 70 */         return str;
/*  43:    */       }
/*  44:    */     }
/*  45: 73 */     return super.a(paramamj);
/*  46:    */   }
/*  47:    */   
/*  48:    */   public void a(amj paramamj, ahd paramahd, List paramList, boolean paramBoolean)
/*  49:    */   {
/*  50: 78 */     if (paramamj.n())
/*  51:    */     {
/*  52: 79 */       fn localfn = paramamj.o();
/*  53:    */       
/*  54: 81 */       String str = localfn.j("author");
/*  55: 82 */       if (!vb.b(str)) {
/*  56: 83 */         paramList.add(a.h + fi.a("book.byAuthor", new Object[] { str }));
/*  57:    */       }
/*  58: 86 */       paramList.add(a.h + fi.a(new StringBuilder().append("book.generation.").append(localfn.f("generation")).toString()));
/*  59:    */     }
/*  60:    */   }
/*  61:    */   
/*  62:    */   public amj a(amj paramamj, aqu paramaqu, ahd paramahd)
/*  63:    */   {
/*  64: 92 */     if (!paramaqu.D) {
/*  65: 93 */       a(paramamj, paramahd);
/*  66:    */     }
/*  67: 95 */     paramahd.a(paramamj);
/*  68: 96 */     paramahd.b(ty.J[alq.b(this)]);
/*  69: 97 */     return paramamj;
/*  70:    */   }
/*  71:    */   
/*  72:    */   private void a(amj paramamj, ahd paramahd)
/*  73:    */   {
/*  74:101 */     if ((paramamj == null) || (paramamj.o() == null)) {
/*  75:102 */       return;
/*  76:    */     }
/*  77:104 */     fn localfn = paramamj.o();
/*  78:105 */     if (localfn.n("resolved")) {
/*  79:106 */       return;
/*  80:    */     }
/*  81:108 */     localfn.a("resolved", true);
/*  82:109 */     if (!b(localfn)) {
/*  83:110 */       return;
/*  84:    */     }
/*  85:112 */     fv localfv = localfn.c("pages", 8);
/*  86:113 */     for (int i = 0; i < localfv.c(); i++)
/*  87:    */     {
/*  88:114 */       String str = localfv.f(i);
/*  89:    */       Object localObject;
/*  90:    */       try
/*  91:    */       {
/*  92:117 */         localObject = hp.a(str);
/*  93:118 */         localObject = hq.a(paramahd, (ho)localObject, paramahd);
/*  94:    */       }
/*  95:    */       catch (Exception localException)
/*  96:    */       {
/*  97:120 */         localObject = new hy(str);
/*  98:    */       }
/*  99:122 */       localfv.a(i, new gc(hp.a((ho)localObject)));
/* 100:    */     }
/* 101:124 */     localfn.a("pages", localfv);
/* 102:125 */     if (((paramahd instanceof qw)) && (paramahd.bY() == paramamj))
/* 103:    */     {
/* 104:126 */       ajk localajk = paramahd.bi.a(paramahd.bg, paramahd.bg.c);
/* 105:127 */       ((qw)paramahd).a.a(new jh(0, localajk.e, paramamj));
/* 106:    */     }
/* 107:    */   }
/* 108:    */   
/* 109:    */   public boolean f(amj paramamj)
/* 110:    */   {
/* 111:133 */     return true;
/* 112:    */   }
/* 113:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     anr
 * JD-Core Version:    0.7.0.1
 */